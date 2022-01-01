package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private By sendkeyfield = By.cssSelector("div.");
    private By message = By.id("result");
    private WebDriver driver;
    public KeyPressesPage(WebDriver driver){
        this.driver=driver;
    }
    public void sendKeys(String text){
        driver.findElement(sendkeyfield).sendKeys(text);
    }
    public String getmessage(){
        return driver.findElement(message).getText();
    }
}
