package spaceInvaders.java.com.example.aleja.spaceInvaders;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import static spaceInvaders.java.com.example.aleja.spaceInvaders.juegoUnitTest.sij;

public class addPuntuacionUnitTest {
    int puntInicial;
    int puntFinal;

    @And("^I have some points$")
    public void i_have_some_points() {
        puntInicial = sij.getPuntuacion();
    }
    @Then("^I should get 100 points more$")
    public void i_should_get_100_points_more(){
        puntFinal = puntInicial+100;
    }
}
