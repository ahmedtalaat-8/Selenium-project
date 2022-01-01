package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;
    private By body = By.tagName("body");
    public NestedFramesPage(WebDriver driver){
        this.driver=driver;
    }
    public String testLeftFrame(){
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        String text = driver.findElement(body).getText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return text ;
    }
    public String testBottomFrame(){
        driver.switchTo().frame("frame-bottom");
        String text = driver.findElement(body).getText();
        driver.switchTo().parentFrame();
        return text;
    }
}
