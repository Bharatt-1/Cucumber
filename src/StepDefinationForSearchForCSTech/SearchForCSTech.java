package StepDefinationForSearchForCSTech;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchForCSTech {
    WebDriver driver = new ChromeDriver();
    @Given("browser is open")
    public void browserIsOpen() {
        System.out.println("Inside-browser is opened");
       // driver.manage().timeouts().implicitlyWait(duration_ofsec,20);
        driver.manage().window().maximize();
    }

    @And("user is on the google search page")
    public void userIsOnTheGoogleSearchPage() {
        System.out.println("Inside-user is on the google search page");
        driver.get("https://www.google.se/");
    }

    @When("user enters the CSTech in search box")
    public void userEntersTheCSTechInSearchBox() {
        System.out.println("Inside-user entered the CSTech in search box");
        driver.findElement(By.name("q")).sendKeys("CSTech");
    }

    @And("clicks enter button")
    public void clicksEnterButton() throws InterruptedException {
        System.out.println("Inside-user clicked enter button");
        Thread.sleep(30);
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//        driver.findElement(By.name("btnK")).click();
    }

    @Then("user is navigated to CSTech webpage")
    public void userIsNavigatedToCSTechWebpage() {
        System.out.println("Inside-user is navigated to CSTech webpage");
        driver.getPageSource().contains("cstech - Google Search");
        driver.quit();
    }
}
