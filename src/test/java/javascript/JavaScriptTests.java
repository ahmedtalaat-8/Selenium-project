package javascript;

import base.BaseTest;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTest {
    @Test
    public void tableScrollTest(){
        homePage.clickDeebDom().scrollToTable();
    }
    @Test
    public void infiniteScrollTest(){
        homePage.clickInfiniteScroll().scrollToParagraph();
    }
}
