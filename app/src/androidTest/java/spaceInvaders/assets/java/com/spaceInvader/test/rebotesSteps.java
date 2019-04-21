package spaceInvaders.assets.java.com.spaceInvader.test;

import cucumber.api.java.en.Then;
import static spaceInvaders.assets.java.com.spaceInvader.test.juegoSteps.sij;
import static org.junit.Assert.assertTrue;



public class rebotesSteps {

    boolean rebotes;

    @Then("^bullets should rebound$")
    public void bullets_should_rebound(){
        rebotes = sij.getRebotes();
        assertTrue(rebotes);

    }
}
