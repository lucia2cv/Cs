package spaceInvaders.java.com.spaceInvaders.test;


import cucumber.api.CucumberOptions;

@CucumberOptions(
        features = {"features"},
        plugin = {"pretty"},
        glue = {"com.spaceInvaders.test"},
        tags = {"@e2e", "@smoke"}
)
@SuppressWarnings("unused")
public class CucumberTestCase {
}
