package LoginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.lang.String;

public class LoginpageForPOM {
    WebDriver driver;
    By user= By.id("login-username");
    By pass=By.name("password");
    By submit=By.name("submit");
    By logout=By.linkText("Log out");

    public LoginpageForPOM(WebDriver driver) {
        this.driver = driver;
    }
    public void validLoginCredUser(String username) {
        driver.findElement(user).sendKeys(username);
    }
    public void validLoginCred(String password) {
//       driver.findElement(user).sendKeys(username);
        driver.findElement(pass).sendKeys(password);
    }
        public void validLogin() {
            driver.findElement(submit).click();
        }
        public void verify(){
        driver.findElement(logout).isDisplayed();
    }
}

