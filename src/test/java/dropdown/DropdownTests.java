package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTest {
    @Test
    public void testDropdown(){
        var dropdownpage = homePage.clickDropdown();
        dropdownpage.selectOption("Option 2");
        var selectedOptions = dropdownpage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1,"there is a problem");
        assertTrue(selectedOptions.contains("Option 2"),"there is no selected ");
    }
}
