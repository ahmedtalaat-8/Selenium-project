package forgetpassword;

import base.BaseTest;
import org.testng.annotations.Test;

public class ForgotPasswordTests extends BaseTest {
    @Test
    public void testForgotPassword(){
        var forgotpasswordpage = homePage.clickForgetPassword();
        forgotpasswordpage.writeEmail();
        forgotpasswordpage.pressButton();
    }
}
