package spaceInvaders;

import android.content.Context;
import android.graphics.Point;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.view.Display;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import spaceInvaders.ObjetosJuego.Alien;
import spaceInvaders.ObjetosJuego.Nave;

import static org.junit.Assert.assertTrue;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class NaveTest {
    private Nave nave;

    @Before
    public void setUp() {
        Context appContext = InstrumentationRegistry.getTargetContext();
        nave = new Nave(appContext,18,10,80.0f);
    }

    @After
    public void tearDown() {
        nave = null;
    }

    @Test
    public void naveColor() {
        String colorInicial;
        String colorFinal;

        nave.setColor("Verde");
        colorInicial = nave.getColor();
        nave.cambiarColor();
        colorFinal = nave.getColor();

        boolean funciona = (!colorInicial.equals(colorFinal));

        assertTrue(funciona);
    }
}
