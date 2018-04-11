package steps_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by promero on 19/12/2017.
 */

public class TestSteps {

    @Given("^I am an user of the system$")
    public void i_am_an_user_of_the_system(){

    }

    @Then("^I search the temperature of \"([^\"]*)\"$")
    public void i_search_the_temperature_of(String sCity){

    }

    @When("The system return the following temperature \"([^\"]*)\"$")
    public void the_system_return_the_following_temperature(String sTemperature){

    }

}