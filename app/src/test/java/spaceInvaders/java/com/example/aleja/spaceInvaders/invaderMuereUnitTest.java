package spaceInvaders.java.com.example.aleja.spaceInvaders;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import static spaceInvaders.java.com.example.aleja.spaceInvaders.juegoUnitTest.bala;
import static spaceInvaders.java.com.example.aleja.spaceInvaders.juegoUnitTest.sij;
import static spaceInvaders.java.com.example.aleja.spaceInvaders.juegoUnitTest.alien;

import static org.junit.Assert.assertFalse;

public class invaderMuereUnitTest {
    @And("^The bullet hit a invader$")
    public void the_bullet_hit_a_invader() {
        bala.setPosition(alien.getPosition().x,alien.getPosition().y);
        alien.setInvisible();
        bala.setInactive();
        sij.alienMuere(false);
    }
    @Then("^The invader died$")
    public void the_invader_died() {
        assertFalse(alien.activo());
    }
}
