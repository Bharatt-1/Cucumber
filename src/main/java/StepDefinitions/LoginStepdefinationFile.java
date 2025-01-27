package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.sql.SQLOutput;

public class LoginStepdefinationFile {
    WebDriver driver = new EdgeDriver();
    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        System.out.println("user is on the login page");
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/index.php?msg=You%20have%20been%20logged%20out!&type=information");

    }

    @When("user enters the username and password")
    public void userEntersTheUsernameAndPassword() {
        System.out.println("user enters the username and password");
        driver.findElement(By.id("login-username")).sendKeys("admin");
        driver.findElement(By.id("login-password")).sendKeys("admin");
    }

    @And("clicks login button")
    public void clicksLoginButton() {
        System.out.println("clicks login button");
        driver.findElement(By.name("submit")).click();
    }

    @Then("user is navigated to the home page")
    public void userIsNavigatedToTheHomePage() {
        System.out.println("User is on the home page");
        driver.getTitle().equals("POSNIC - Dashboard");
        driver.quit();
    }
}
