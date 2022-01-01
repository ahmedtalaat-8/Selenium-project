package keypresses;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyPressesTests extends BaseTest {
    @Test
    public void keypressestest(){
        var keypressespage = homePage.clickKeyPresses();
        keypressespage.sendKeys("A"+ Keys.BACK_SPACE);
        assertEquals(keypressespage.getmessage(),"You entered: BACK_SPACE");
    }

}
