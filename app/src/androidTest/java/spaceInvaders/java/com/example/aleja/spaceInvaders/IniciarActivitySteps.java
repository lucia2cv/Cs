package spaceInvaders.java.com.example.aleja.spaceInvaders;

import android.app.Activity;
import android.content.Intent;
import android.support.test.rule.ActivityTestRule;

import com.spaceInvaders.android.R;

import org.junit.Rule;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import spaceInvaders.Activities.MainActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static junit.framework.Assert.assertNotNull;
import static org.hamcrest.Matchers.not;

public class IniciarActivitySteps {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    private Activity activity;

    @Before("@smoke")
    public void setup() {
        activityTestRule.launchActivity(new Intent());
        activity = activityTestRule.getActivity();
    }

    @After("@smoke")
    public void tearDown() {
        activityTestRule.finishActivity();
    }

    @Given("^I am on main screen")
    public void I_am_on_main_screen() {
        assertNotNull(activity);
    }

    @When("^I input name (\\S+)$")
    public void I_input_name(final String name) {
        onView(withId(R.id.nombre)).perform(typeText(name));
    }

    @When("^I input age \"(.*?)\"$")
    public void I_input_age(final String age) {
        onView(withId(R.id.anyos)).perform(typeText(age), closeSoftKeyboard());
    }

    @When("^I press submit button$")
    public void I_press_submit_button() {
        onView(withId(R.id.button)).perform(click());
    }

    @When("^I tap Rebotes button$")
    public void I_tap_Rebotes_button() {
        onView(withId(R.id.REBOTES)).perform(click());
    }



    @Then("^I should see mayor activity screen$")
    public void I_should_see_mayor_activity_screen() {
        onView(withId(R.id.anyos)).check(matches(withText(R.string.title_activity_mayor)));
    }

    @Then("^I should see mayor rebotes activity screen$")
    public void I_should_see_mayor_rebotes_activity_screen() {
        onView(withId(R.id.REBOTES)).check(matches(withText(R.string.title_activity_mayor)));
    }

    @Then("^I should see puntuacion activity screen$")
    public void I_should_see_puntuacion_activity_screen() {
        onView(withId(R.id.textView)).check(matches(withId(R.id.finDeJuego)));
    }

}
