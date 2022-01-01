package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropdownPage clickDropdown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }
    public ForgetPasswordPage clickForgetPassword(){
        clickLink("Forgot Password");
        return new ForgetPasswordPage(driver);
    }
    public HoverPage clickHover(){
        clickLink("Hovers");
        return new HoverPage(driver);
    }
    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }
    public HorizontalSlider clickHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSlider(driver);
    }
    public AlertPage clickAlertPage(){
        clickLink("JavaScript Alerts");
        return new AlertPage(driver);
    }
    public FileuploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileuploadPage(driver);
    }
    public ContextPage clickContextMenue(){
        clickLink("Context Menu");
        return new ContextPage(driver);
    }
    public WYSIWYGPage clickWYSIWYG(){
        clickLink("WYSIWYG Editor");
        return new WYSIWYGPage(driver);
    }
    public FramesPage clickFrames(){
        clickLink("Frames");
        return new FramesPage(driver);
    }
    public DynamicLoadingPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
    public LargeDeebDomPage clickDeebDom(){
        clickLink("Large & Deep DOM");
        return new LargeDeebDomPage(driver);
    }
    public InfiniteScrollPage clickInfiniteScroll(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }
    public MultipleWindowsPage clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }
    private void clickLink(String linktext){
         driver.findElement(By.linkText(linktext)).click();
    }
}
