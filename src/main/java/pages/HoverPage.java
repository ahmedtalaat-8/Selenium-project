package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {
    private By figureclass = By.className("figure");
    WebDriver driver;
    public HoverPage (WebDriver driver){
        this.driver = driver;
    }
    public void hoverOnFiguers(int index){
        WebElement figure = driver.findElements(figureclass).get(index);
        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();
    }
}
