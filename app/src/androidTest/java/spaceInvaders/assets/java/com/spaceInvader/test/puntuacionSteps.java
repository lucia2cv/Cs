package spaceInvaders.assets.java.com.spaceInvader.test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import static spaceInvaders.assets.java.com.spaceInvader.test.juegoSteps.bala;
import static spaceInvaders.assets.java.com.spaceInvader.test.juegoSteps.sij;
import static spaceInvaders.assets.java.com.spaceInvader.test.juegoSteps.alien;

import static org.junit.Assert.assertTrue;

public class puntuacionSteps {

    int puntInicial;
    int puntFinal;

    @And("^the bullet hit an invader")
    public void the_bullet_hit_an_invader(){
        puntInicial = sij.getPuntuacion();
        bala.setPosition(alien.getPosition().x,alien.getPosition().y);
        alien.setInvisible();
        bala.setInactive();
        sij.alienMuere(false);
        puntFinal = sij.getPuntuacion();

    }

    @Then("^I should get some points")
    public void I_should_get_some_points(){
        assertTrue(puntFinal!=puntInicial);
    }
}
