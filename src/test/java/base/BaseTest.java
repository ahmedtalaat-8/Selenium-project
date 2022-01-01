package base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.WindowManger;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class BaseTest {
    protected HomePage homePage;
    private WebDriver driver;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        goHome();
    }
    @BeforeMethod
    public void goHome(){
         driver.get("https://the-internet.herokuapp.com");
        homePage = new HomePage(driver);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
    @AfterMethod
    public void takeScreenshots(ITestResult result){
        if(result.getStatus() == ITestResult.FAILURE){ var camer = (TakesScreenshot)driver;
            File screenshot = camer.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot,new File("resources/screenshots/"+result.getName()+".png"));
            }catch (IOException e){
                e.printStackTrace();
            }
       }}
    public ChromeOptions getCromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        return options;
    }

    public WindowManger getWidowManger(){
        return new WindowManger(driver);
    }
}
