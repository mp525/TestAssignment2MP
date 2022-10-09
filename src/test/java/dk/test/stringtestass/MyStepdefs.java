package dk.test.stringtestass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStepdefs {

    private String validInput;
    private String reverseString;

    private String capitalizedString;

    private String lowercaseString;

    // Reversing
    @Given("Utility is given valid {string} input")
    public void utility_is_given_valid_a_bc_input(String input) {
        // Write code here that turns the phrase above into concrete actions
        this.validInput = input;
    }
    @When("Utility reverse string method is called")
    public void utility_reverse_string_method_is_called() {
        // Write code here that turns the phrase above into concrete actions
        reverseString = StringUtility.reverseString(validInput);
    }
    @Then("Reversed output string is {string}")
    public void reversed_output_string_is(String string) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(string, reverseString);
    }

    // Capitalization
    @Given("Utility is given a valid {string} input")
    public void utility_is_given_a_valid_input(String string) {
        // Write code here that turns the phrase above into concrete actions
        this.validInput = string;
    }
    @When("Utility capitalize string method is called")
    public void utility_capitalize_string_method_is_called() {
        // Write code here that turns the phrase above into concrete actions
        capitalizedString = StringUtility.capitalizeString(validInput);
    }

    @Then("Capital output string is {string}")
    public void capital_output_string_is(String string) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(string, capitalizedString);
    }

    // Lowercase
    @Given("Utility is given a valid capital {string} input")
    public void utility_is_given_a_valid_capital_input(String string) {
        // Write code here that turns the phrase above into concrete actions
        this.validInput = string;
    }
    @When("Utility lowercase string method is called")
    public void utility_lowercase_string_method_is_called() {
        // Write code here that turns the phrase above into concrete actions
        lowercaseString = StringUtility.lowercaseString(validInput);
    }
    @Then("Lowecase output string is {string}")
    public void lowecase_output_string_is(String string) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(string, lowercaseString);
    }


}
