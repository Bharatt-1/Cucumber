package StepDefinationFoe_PageFactory;


import PageFactory.HomePageFactory;
import PageFactory.Login_PageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.String;


public class LoginScenarioPageFactory {

        WebDriver driver = new ChromeDriver();
        Login_PageFactory login1;
        HomePageFactory home;

    @Given("user is on the login page")
        public void userIsOnTheLoginPage() {
            System.out.println("user is on the login page");
            driver.manage().window().maximize();
            driver.get("https://stock.scriptinglogic.in/index.php?msg=You%20have%20been%20logged%20out!&type=information");

        }

        @When("user enters the correct username and correct password")
        public void userEntersTheCorrectUsernameAndCorrectPassword(String username,String password) {

            login1 = new Login_PageFactory(driver);
            login1.enterUser(username);
            login1.enterPass(password);

            System.out.println("user enters the username and password");
           // driver.findElement(By.id("login-username")).sendKeys(username);
           // driver.findElement(By.name("password")).sendKeys(username);
        }

        @And("click on login button")
        public void clickOnLoginButton() {

            login1.clickButton();

            System.out.println("clicks login button");
            //driver.findElement(By.name("submit")).click();
        }

        @Then("user is navigated to the home page")
        public void userIsNavigatedToTheHomePageOfAdmin() {
            System.out.println("User is on the home page");
            home = new HomePageFactory(driver);
            home.verify();
            driver.close();
            driver.quit();
           // driver.findElement(By.linkText("Log out")).isDisplayed();
        }
    }
