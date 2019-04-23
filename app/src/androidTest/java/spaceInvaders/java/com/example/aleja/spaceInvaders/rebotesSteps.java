package spaceInvaders.java.com.example.aleja.spaceInvaders;

import cucumber.api.java.en.Then;
import static spaceInvaders.java.com.example.aleja.spaceInvaders.juegoSteps.sij;
import static org.junit.Assert.assertTrue;



public class rebotesSteps {

    boolean rebotes;

    @Then("^bullets should rebound$")
    public void bullets_should_rebound(){
        rebotes = sij.getRebotes();
        assertTrue(rebotes);

    }
}
