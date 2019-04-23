package spaceInvaders.java.com.example.aleja.spaceInvaders;

import android.graphics.Point;
import android.support.test.InstrumentationRegistry;

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

public class juegoSteps {
    static Context appContext;
    static SpaceInvadersJuego sij;
    static Disparo bala;
    static Alien alien;
    static Nave nave;
    Point point = new Point();
    private MayorActivity MayorActivity = new MayorActivity();

    @Given("^I am playing$")
    public void I_am_playing(){
        appContext = InstrumentationRegistry.getContext();
        sij = new SpaceInvadersJuego(appContext,point,true,false, MayorActivity,"hola");
        nave = sij.getNave();
        alien = sij.getAliens().get(0);
    }

    @And("^an invader shoot$")
    public void an_invader_shoot(){
        alien.setActivo(true);
        sij.disparar(alien.getScreenX()+5,alien.getScreenY(),false);
        bala = (Disparo) sij.getControladorObjetos().get("disparo"+0);
        sij.getControladorObjetos().updateAll();
    }

    @When("^the bullet hit the ship$")
    public void the_bullet_hit_the_ship(){
        bala.setPosition(nave.getPosition().x,nave.getPosition().y);
        bala.setInactive();
        nave.setInvisible();
        sij.getControladorObjetos().updateAll();
        sij.mostrarPuntuacionFin();
    }

    @Then("^the game should end")
    public void the_game_should_end(){
        assertTrue(sij.getJugando());
    }
}
