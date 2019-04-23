package spaceInvaders.java.com.example.aleja.spaceInvaders;

import cucumber.api.java.en.Then;

import static org.junit.Assert.assertTrue;
import static spaceInvaders.java.com.example.aleja.spaceInvaders.juegoUnitTest.sij;


public class rebotesUnitTest {

    boolean rebotes;

    @Then("^bullets should rebound$")
    public void bullets_should_rebound(){
        rebotes = sij.getRebotes();
        assertTrue(rebotes);

    }
}
