package crossbrowsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsingTest {
    private WebDriver driver;
    @Test
    @Parameters({"URL","BrowserType"})
    public void verifyTAU(String url , String browsertype){
        if(browsertype.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (browsertype.equalsIgnoreCase("FireFox")){
            System.setProperty("webdriver.gecko.driver","resources/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.get(url);
        driver.quit();
    }
}
