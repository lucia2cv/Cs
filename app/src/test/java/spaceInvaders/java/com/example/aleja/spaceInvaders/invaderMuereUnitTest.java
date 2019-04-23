package spaceInvaders.java.com.example.aleja.spaceInvaders;

import cucumber.api.java.en.And;

import static spaceInvaders.java.com.example.aleja.spaceInvaders.juegoUnitTest.bala;
import static spaceInvaders.java.com.example.aleja.spaceInvaders.juegoUnitTest.sij;
import static spaceInvaders.java.com.example.aleja.spaceInvaders.juegoUnitTest.alien;

public class invaderMuereUnitTest {
    @And("^The bullet hit an invader$")
    public void the_bullet_hit_an_invader() {
        bala.setPosition(alien.getPosition().x,alien.getPosition().y);
        alien.setInvisible();
        bala.setInactive();
        sij.alienMuere(false);
    }
}
