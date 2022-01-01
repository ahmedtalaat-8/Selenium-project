package nested;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NestedFramesTests extends BaseTest {
    @Test
    public void testNestedFrames(){
        var nestedpage = homePage.clickFrames().clickNested();
        assertEquals(nestedpage.testLeftFrame(),"LEFT","NOT LEFT");
        assertEquals(nestedpage.testBottomFrame(),"BOTTOM","NOT BOTTOM");
    }
}
