package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    private WebDriver driver;
    public InfiniteScrollPage (WebDriver driver){
        this.driver = driver ;
    }
    public void scrollToParagraph(){
        String script = "window.scrollTo(0,document.body.scrollHeight)";
        ((JavascriptExecutor)driver).executeScript(script);
    }
}
