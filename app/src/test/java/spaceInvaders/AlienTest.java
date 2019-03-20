package spaceInvaders;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;


import spaceInvaders.Activities.MayorActivity;
import spaceInvaders.ObjetosJuego.Alien;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;


import static org.junit.Assert.*;

public class AlienTest {
    private Alien alien;
    private Point point = new Point();
    private boolean mayor= true;
    private boolean rebotes= false;
    private Activity activity = new MayorActivity();
    private Context context = activity;
    private String nombre= "hola";

    private int fila = 0;
    private int columna = 0;
    private int screenX = point.x;
    private int screenY = point.y;
    private float velocidad = 80.0f;



    @Before
    public void setUp() throws Exception {

        SpaceInvadersJuego sij = new SpaceInvadersJuego(context,point,mayor,rebotes,activity,nombre);
        alien= new Alien(context,fila,columna, screenX,screenY,sij,mayor,velocidad);
    }
    @After
    public void tearDown() throws Exception {
        alien = null;
    }

    @Test
    public void alienColor() {
        String colorInicial;
        String colorFinal;

        alien.setColor("Verde");
        colorInicial = alien.getColor();
        alien.cambiarColor();
        colorFinal = alien.getColor();

        boolean funciona = (!colorInicial.equals(colorFinal));

        assertTrue(funciona);


    }
}
