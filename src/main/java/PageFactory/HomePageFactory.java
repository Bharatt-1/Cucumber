package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFactory {

    WebDriver driver;
    @FindBy(linkText = "Log out")
    WebElement validate;

    public HomePageFactory(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,HomePageFactory.class);
    }
    public void verify(){
        validate.isDisplayed();
    }
}
