package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example1Page {
    private WebDriver driver;
    private By loadingIndicator = By.id("loading");
    private By text = By.id("finish");
    public Example1Page(WebDriver driver){
        this.driver = driver;
    }
    public void clickStart(){
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/button")).click();
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
    }
    public String getText(){
        return driver.findElement(text).getText();
    }
}
