package spaceInvaders;

import android.content.Context;
import android.graphics.PointF;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import spaceInvaders.ObjetosJuego.Alien;

import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class UpdateAlienTest {
    private Alien alien;


    @Before
    public void setUp() {
        Context appContext = InstrumentationRegistry.getTargetContext();
        alien = new Alien(appContext,true);
    }

    @After
    public void tearDown() {
        alien = null;
    }

    @Test
    public void alienUpdate() {
        Alien.Estado estadoInicial;
        Alien.Estado estadoFinal;

        PointF loc = alien.getPosition();
        loc.x = (alien.getScreenX()- ((alien.getLength() + alien.getPadding()) * (6 - alien.getColumna())))+1;
        alien.setPosition(loc.x,loc.y);


        alien.setEstado(Alien.Estado.DERECHA);

        estadoInicial = alien.getEstado();
        alien.update();
        estadoFinal = alien.getEstado();

        boolean funciona = false;
        if(estadoFinal != estadoInicial){
            funciona = true;
        }


        assertTrue(funciona);
    }
}
