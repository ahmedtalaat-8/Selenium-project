package dynamicLoading;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingTests extends BaseTest {
    @Test
    public void testLoadingPage1(){
        var loadingPage1 = homePage.clickDynamicLoading().clickExample1();
        loadingPage1.clickStart();
        assertEquals(loadingPage1.getText(),"Hello World!","there is smth wrong");
    }
    @Test
    public void testLoadingPage2(){
        var loadingPage2 = homePage.clickDynamicLoading().clickExample2();
        loadingPage2.clickStart();
        assertEquals(loadingPage2.getText(),"Hello World!","wrong");
    }
}
