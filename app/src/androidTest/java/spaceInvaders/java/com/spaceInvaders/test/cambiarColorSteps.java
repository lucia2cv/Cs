package spaceInvaders.java.com.spaceInvaders.test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import spaceInvaders.ObjetosJuego.Barrera;
import spaceInvaders.ObjetosJuego.Disparo;

import static spaceInvaders.java.com.spaceInvaders.test.juegoSteps.nave;
import static spaceInvaders.java.com.spaceInvaders.test.juegoSteps.sij;
import static spaceInvaders.java.com.spaceInvaders.test.juegoSteps.bala;
import static spaceInvaders.java.com.spaceInvaders.test.juegoSteps.alien;

import static org.junit.Assert.assertTrue;

public class cambiarColorSteps {
    Barrera barrera;
    String colorInicial;
    String colorFinal;

    @And("^There is a barrier$")
    public void There_is_a_barrier(){
        barrera = sij.getBarreras()[0];
        colorInicial = sij.getAliens().get(0).getColor();
    }

    @When("^the ship shoots$")
    public void the_ship_shoots(){
        sij.disparar(nave.getPosition().x,nave.getPosition().y,true);
        bala = (Disparo) sij.getControladorObjetos().get("disparo"+0);
    }

    @And("^hit a barrier$")
    public void hit_a_barrier(){
        bala.setPosition(barrera.getPosition().x,barrera.getPosition().y);
        bala.setInactive();
        barrera.setInvisible();
        alien.cambiarColor();
        colorFinal= alien.getColor();
    }

    @Then("^the colour should be changed$")
    public void the_colour_should_be_changed(){
        assertTrue(!colorFinal.equals(colorInicial));
    }
}
