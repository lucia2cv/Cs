package spaceInvaders.java.com.example.aleja.spaceInvaders;

import android.graphics.Point;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import spaceInvaders.Activities.MayorActivity;
import spaceInvaders.ObjetosJuego.Disparo;
import spaceInvaders.ObjetosJuego.Alien;
import spaceInvaders.SpaceInvadersJuego;
import spaceInvaders.ObjetosJuego.Nave;
import static org.junit.Assert.assertTrue;


import static org.mockito.Mockito.*;

public class juegoUnitTest {
    static SpaceInvadersJuego sij;
    static Disparo bala;
    static Alien alien;
    static Nave nave;

    Point point = new Point();
    private MayorActivity MayorActivity = new MayorActivity();
    @Given("^I am playing$")
    public void I_am_playing(){
        sij = mock(SpaceInvadersJuego.class);
    }

    @And("^an invader shoot$")
    public void an_invader_shoot(){
        bala = mock(Disparo.class);
        when(bala.activo()).thenReturn(true);
    }

    @When("^the bullet hit the ship$")
    public void the_bullet_hit_the_ship(){
        sij.mostrarPuntuacionFin();
    }

    @Then("^the game should end")
    public void the_game_should_end(){
        assertTrue(sij.getJugando());
    }
    }