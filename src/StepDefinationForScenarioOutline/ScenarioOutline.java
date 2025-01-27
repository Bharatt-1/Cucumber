package StepDefinationForScenarioOutline;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScenarioOutline {
    WebDriver driver = new ChromeDriver();

    @Given("user is on the login page of admin")
    public void userIsOnTheLoginPageOfAdmin() {
        System.out.println("user is on the login page");
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/index.php?msg=You%20have%20been%20logged%20out!&type=information");

    }

   @When("user enters the {} and {}")
    public void userEntersTheUsernameAndPassword(String username, String password) {
        System.out.println("user enters the username and password");
        driver.findElement(By.id("login-username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(username);
    }

   @And("click on login button")
    public void clickOnLoginButton() {
        System.out.println("clicks login button");
        driver.findElement(By.name("submit")).click();
    }

    @Then("user is navigated to the home page of admin")
    public void userIsNavigatedToTheHomePageOfAdmin() {
        System.out.println("User is on the home page");
        driver.getTitle().equals("POSNIC - Dashboard");
        driver.quit();
    }
}
