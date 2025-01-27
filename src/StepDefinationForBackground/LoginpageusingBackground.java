package StepDefinationForBackground;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginpageusingBackground {

    @Given("user is on the signin page")
    public void user_is_on_the_signin_page() {
        System.out.println(" sign-in ");
    }

    @When("user enters the valid-email and valid-password")
    public void user_enters_the_valid_email_and_valid_password() {
        System.out.println(" enter cred ");
    }

    @And("click login button")
    public void click_login_button() {
        System.out.println(" clicked button ");
    }

    @Then("user is navigated to home page")
    public void user_is_navigated_to_home_page() {
        System.out.println("I on the home page");
    }

    @Given("user is on the login page of app")
    public void userIsOnTheLoginPageOfApp() {
        System.out.print("I");
    }

    @When("user enters userid and pass")
    public void userEntersUseridAndPass() {
        System.out.print(" Love ");
    }

    @And("click ok")
    public void clickOk() {
        System.out.print(" CS");
    }

    @Then("user is navigated to the home page of app")
    public void userIsNavigatedToTheHomePageOfApp() {
        System.out.println("TECH ");
    }


    @When("user enters the invalid-email and invalid-password")
    public void user_enters_the_invalid_email_and_invalid_password() {
        System.out.println("entered in-valid cred");
    }

    @And("click login button1")
    public void click_login_button1() {
        System.out.println(" clicked button ");
    }

    @Then("user is navigated to signin page only")
    public void user_is_navigated_to_signin_page_only() {
        System.out.println("I am redirected to login page only");
    }
}


