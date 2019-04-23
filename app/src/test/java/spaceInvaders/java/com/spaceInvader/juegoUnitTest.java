package spaceInvaders.java.com.spaceInvader;

import android.graphics.Point;

import android.content.Context;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import spaceInvaders.Activities.MayorActivity;
import spaceInvaders.ObjetosJuego.Alien;
import spaceInvaders.ObjetosJuego.Disparo;
import spaceInvaders.ObjetosJuego.Nave;
import spaceInvaders.SpaceInvadersJuego;
import static org.junit.Assert.assertTrue;

import static org.mockito.ArgumentMatchers.anyFloat;
import static org.mockito.Mockito.*;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class juegoUnitTest {
    static Context appContext;
    static SpaceInvadersJuego sij;
    static Disparo bala;
    static Alien alien;
    static Nave nave;
    Point point = new Point();
    private MayorActivity MayorActivity = new MayorActivity();
    @Given("^I am playing$")
    public void I_am_playing(){
        sij = mock(SpaceInvadersJuego.class)
;
    }