package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileuploadPage {
    private WebDriver driver;
    private By browsebutton = By.id("file-upload");
    private By uploadbutton = By.id("file-submit");
    private By uploadmessage = By.id("uploaded-files");
    public FileuploadPage(WebDriver driver){
        this.driver=driver;
    }
    public void uploadFile(String filepath){
        driver.findElement(browsebutton).sendKeys(filepath);
        driver.findElement(uploadbutton).click();
    }
    public String getMessage(){
        return driver.findElement(uploadmessage).getText();
    }
}
