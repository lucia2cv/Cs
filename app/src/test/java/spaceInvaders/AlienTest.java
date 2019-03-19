package spaceInvaders;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;


import spaceInvaders.ObjetosJuego.Alien;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;


import static org.junit.Assert.*;

public class AlienTest {
    private Alien alien;
    private Context context;
    private Point point;
    private boolean mayor;
    private boolean rebotes;
    private Activity activity;
    private String nombre;

    private int fila;
    private int columna;
    private int screenX;
    private int screenY;
    private float velocidad;


    @Before
    public void setUp() throws Exception {

        SpaceInvadersJuego sij = null; //new SpaceInvadersJuego(context,point,mayor,rebotes,activity,nombre);
        alien= new Alien(context,fila,columna, screenX,screenY,sij,mayor,velocidad);
    }
    @After
    public void tearDown() throws Exception {
        alien = null;
    }

    @Test
    public void alienColor() {
        String color;
        String colorFinal;

        alien.setColor("verde");
        color = alien.getColor();
        alien.cambiarColor();
        colorFinal = alien.getColor();

        boolean funciona = (!color.equals(colorFinal));

        assertTrue(funciona);


    }
}
