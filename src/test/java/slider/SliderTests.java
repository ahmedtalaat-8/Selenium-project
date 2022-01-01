package slider;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HorizontalSlider;

import static org.testng.Assert.assertEquals;

public class SliderTests extends BaseTest {
    @Test
    public void testSlider(){
        var sliderpage = homePage.clickHorizontalSlider();
        while (!sliderpage.getNumber().equals("4")){
            sliderpage.Sliding();
        }
        assertEquals(sliderpage.getNumber(),"4","there is smth wrong");
    }


}
