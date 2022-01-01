package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSlider {
    private WebDriver driver;
    private By getslider = By.tagName("input");
    private By number = By.id("range");
    public HorizontalSlider(WebDriver driver){
        this.driver=driver;
    }
    public void Sliding(){
        WebElement slider = driver.findElement(getslider);
        slider.sendKeys(Keys.ARROW_RIGHT);
    }
    public String getNumber(){
        return driver.findElement(number).getText();
    }

}
