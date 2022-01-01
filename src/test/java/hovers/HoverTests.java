package hovers;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HoverPage;

public class HoverTests extends BaseTest {
    @Test
    public void testHovers(){
        HoverPage hoverpage = homePage.clickHover();
        hoverpage.hoverOnFiguers(2);
    }
}
