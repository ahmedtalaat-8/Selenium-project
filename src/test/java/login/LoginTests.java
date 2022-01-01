package login;

import base.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecurePage;

import static org.testng.Assert.*;

public class LoginTests extends BaseTest {
    @Test(dataProvider="loginData")
    public void testSuccessfulLogin(String userId,String pass,String exp){
        LoginPage loginpage = homePage.clickFormAuthentication();
        loginpage.setUserName(userId);
        loginpage.setUserPassword(pass);
    }
    @DataProvider(name = "loginData")
    public Object [][] loginData(){
        Object data [][] = {
                {"a","b","c"},
                {"d","e","f"},
                {"g","h","i"}

        };
        return data;
    }
}
