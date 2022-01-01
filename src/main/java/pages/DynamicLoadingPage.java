package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }
    public Example1Page clickExample1(){
        driver.findElement(By.xpath("/html/body/div[2]/div/div/a[1]")).click();
        return new Example1Page(driver);
    }
    public Example2Page clickExample2(){
        driver.findElement(By.linkText("Example 2: Element rendered after the fact")).click();
        return new Example2Page(driver);
    }
}
