package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AlertPage {
    private WebDriver driver;
    private By jsAlert = By.xpath("/html/body/div[2]/div/div/ul/li[1]/button");
    private By jsConfirm = By.xpath("/html/body/div[2]/div/div/ul/li[2]/button");
    private By jsPromt = By.xpath("/html/body/div[2]/div/div/ul/li[3]/button");
    private By result = By.id("result");
    public AlertPage(WebDriver driver){
        this.driver=driver;
    }
    public void triggerAlert(){
        driver.findElement(jsAlert).click();
        driver.switchTo().alert().accept();
    }
    public void triggerConfirm(){
        driver.findElement(jsConfirm).click();
        driver.switchTo().alert().dismiss();
    }
    public void triggerPromt(){
        driver.findElement(jsPromt).click();
        driver.switchTo().alert().sendKeys("i love maha");
        driver.switchTo().alert().accept();
    }
    public String getResult(){
        return driver.findElement(result).getText();
    }

}
