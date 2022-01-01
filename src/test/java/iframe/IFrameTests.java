package iframe;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class IFrameTests extends BaseTest {
    @Test
    public void testIFrame(){
        var wysiwygPage = homePage.clickWYSIWYG();
        wysiwygPage.clearEditor();
        wysiwygPage.writeInEditor("Hello World");
        wysiwygPage.clickIncreseIndent();
        wysiwygPage.writeInEditor("habibi");
        assertEquals(wysiwygPage.getText(),"Hello Worldhabibi","there is smth wrong");

    }

}
