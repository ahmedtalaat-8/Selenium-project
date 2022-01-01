package alert;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class UploadTests extends BaseTest {
    @Test
    public void uploadFileTest(){
        var uploadpage = homePage.clickFileUpload();
        uploadpage.uploadFile("C:\\Users\\Ahmed\\Desktop\\edo finaal\\edo_finaal_First_Frame.png");
        assertEquals(uploadpage.getMessage(),"edo_finaal_First_Frame.png","there is smth wrong");
    }
}
