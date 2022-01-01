package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextPage {
    private WebDriver driver;
    private By box_id = By.id("hot-spot");
    public ContextPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickBox(){
        WebElement Box = driver.findElement(box_id);
        Actions actions = new Actions(driver);
        actions.moveToElement(Box).contextClick().perform();
    }
    public void triggerAlert(){
        driver.switchTo().alert().accept();
    }
    public String getAlertMessage(){
        return driver.switchTo().alert().getText();
    }
}
