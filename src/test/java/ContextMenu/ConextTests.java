package ContextMenu;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ConextTests extends BaseTest {
    @Test
    public void testContext(){
        var contextPage = homePage.clickContextMenue();
        contextPage.clickBox();
        assertEquals(contextPage.getAlertMessage(),"You selected a context menu","there is something wrong");
        contextPage.triggerAlert();
    }
}
