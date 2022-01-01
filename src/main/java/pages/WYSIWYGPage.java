package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGPage {
    private WebDriver driver ;
    private String editor = "mce_0_ifr";
    private By body = By.id("tinymce");
    private By increaseundent = By.xpath("/html/body/div[2]/div/div/div/div[1]/div[1]/div[2]/div/div[5]/button[2]");
    public WYSIWYGPage(org.openqa.selenium.WebDriver driver){
        this.driver = driver;
    }
    public void writeInEditor(String text){
        switchToEditor();
        driver.findElement(body).sendKeys(text);
        switchToMainArea();
    }
    public String getText(){
        switchToEditor();
        String text =  driver.findElement(body).getText();
        switchToMainArea();
        return text;
    }
    public void clearEditor(){
        switchToEditor();
        driver.findElement(body).clear();
        switchToMainArea();
    }
    public void clickIncreseIndent(){
        driver.findElement(increaseundent).click();
    }
    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
    private void switchToEditor(){
        driver.switchTo().frame(editor);
    }
}
