package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeDeebDomPage {
    private WebDriver driver;
    private By tableID = By.id("large-table");
    public LargeDeebDomPage (WebDriver driver){
        this.driver = driver;
    }
    public void scrollToTable(){
        WebElement table = driver.findElement(tableID);
        String jsScript="arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(jsScript,table);
    }
}
