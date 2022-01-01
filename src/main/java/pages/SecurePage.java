package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage {
    private By statusAlert = By.id("flash");
    private WebDriver driver;
    public SecurePage(WebDriver driver){
        this.driver = driver;
    }
    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }
}
