package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPasswordPage {
    WebDriver driver;
    public ForgetPasswordPage(WebDriver driver){
        this.driver=driver;
    }
    public void writeEmail(){
        driver.findElement(By.id("email")).sendKeys("a7moda@gmail.com");
    }
    public void pressButton(){
        driver.findElement(By.id("form_submit")).click();
    }
}
