package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.String;

public class Login_PageFactory {
    @FindBy(id = "login-username")
    WebElement user;
    @FindBy(name = "password")
    WebElement pass;
    @FindBy(name = "submit")
    WebElement button;


    WebDriver driver;

    public Login_PageFactory(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,Login_PageFactory.class);
    }

    public void enterUser(String username)  {

        user.sendKeys("admin");
    }
    public void enterPass(String password) {

        pass.sendKeys("admin");
    }
    public void clickButton(){
        button.click();
    }

}
