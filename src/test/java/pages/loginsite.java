package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginsite {
    WebDriver driver;

    By txtUsername = By.id("user-name");
    By txtPassword = By.id("password");
    By btnLogin = By.id("login-button");

    public loginsite(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String user, String pass) {
        driver.findElement(txtUsername).sendKeys(user);
        driver.findElement(txtPassword).sendKeys(pass);
        driver.findElement(btnLogin).click();
    }
}