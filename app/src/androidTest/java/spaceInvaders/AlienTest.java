package spaceInvaders;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import spaceInvaders.Activities.MayorActivity;
import spaceInvaders.ObjetosJuego.Alien;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class AlienTest {
    private Alien alien;

    @Before
    public void setUp() {
        Context appContext = InstrumentationRegistry.getTargetContext();
        alien = new Alien(appContext);
    }

    @After
    public void tearDown() {
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

    /*
    @Test
    public void alienCambioSentido() {

        Alien.Estado estadoInicial;
        Alien.Estado estadoFinal;

        alien.setEstado(Alien.Estado.Izquierda);
        estadoInicial = alien.getEstado();
        alien.mediaVuelta();
        estadoFinal = alien.getEstado();

        boolean funciona = (!estadoInicial.equals(estadoFinal));

        assertTrue(funciona);
    }
    //*/
}
