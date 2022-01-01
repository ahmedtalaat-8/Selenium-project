package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernamefield = By.id("username");
    private By passwordfield = By.id("password");
    private By loginButtonfield = By.cssSelector("#login button");
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void setUserName(String userName){
        driver.findElement(usernamefield).sendKeys(userName);
    }
    public void setUserPassword(String password){
        driver.findElement(passwordfield).isDisplayed();
    }
    public SecurePage pressLoginButtom(){
        driver.findElement(loginButtonfield).click();
        return new SecurePage(driver);
    }
}
