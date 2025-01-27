package StepDefinationForHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageUsingHooks {

    WebDriver driver=null;

    @Before(order = 0)
    public void browsersetup(){
        System.out.println("Iam in side browsersetup");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Before(value = "@SmokeTest")
    public void browser(){
        System.out.println("Iam in side browsersetup");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Before(order = 1)
    public void browserset(){
        System.out.println("Iam in  browsersetup");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After(order = -1)
    public void browserset1(){
        System.out.println("Iam quiting browsersetup");
        driver.close();
        driver.quit();
    }

    @After(order = -2)
    public void browsersetup1(){
        System.out.println("Iam quiting the browsersetup");
        driver.quit();
    }

    @BeforeStep
    public void browseIn(){
        System.out.println("I am Good");
    }

    @AfterStep
    public void browserOut(){
        System.out.println("I am ok");
    }

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println(" ");
    }
    @When("user enters the email and password")
    public void user_enters_the_emailand_password() {
        System.out.println(" ");
    }
    @And("clicks login button")
    public void clicks_login_button() {
        System.out.println(" ");
    }
    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        System.out.println(" ");
    }
}
