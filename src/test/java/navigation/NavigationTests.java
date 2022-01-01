package navigation;

import base.BaseTest;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTest {
    @Test
    public void testNavigation(){
        homePage.clickDynamicLoading().clickExample1();
        getWidowManger().goBack();
    }
    @Test
    public void testMultipleWindows(){
        homePage.clickMultipleWindows().clickHere();
        getWidowManger().switchTo("New Window");
    }
}
