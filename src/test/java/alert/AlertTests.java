package alert;

import base.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTest {
    @Test
    public void testAlert(){
        var alertpage = homePage.clickAlertPage();
        alertpage.triggerAlert();
        assertEquals(alertpage.getResult(),"You successfully clicked an alert");
    }
    @Test
    public void testConfirm(){
        var alertpage = homePage.clickAlertPage();
        alertpage.triggerConfirm();
        assertEquals(alertpage.getResult(),"You clicked: Cancel");
    }
    @Test
    public void testPromt(){
        var alertpage = homePage.clickAlertPage();
        alertpage.triggerPromt();
        assertEquals(alertpage.getResult(),"You entered: i love maha");
    }
}
