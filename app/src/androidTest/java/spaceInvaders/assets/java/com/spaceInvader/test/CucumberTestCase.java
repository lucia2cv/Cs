package spaceInvaders.assets.java.com.spaceInvader.test;


import cucumber.api.CucumberOptions;

@CucumberOptions(
        features = {"features"},
        plugin = {"pretty"},
        glue = {"com.spaceInvaders"},
        tags = {"@e2e", "@smoke"}
)
@SuppressWarnings("unused")
public class CucumberTestCase {
}
