package clarusway.tests;

import clarusway.pages.HtmlGoodiesHomePagae;
import clarusway.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Day02_C03_PageClassExample {
    @Test
    public void test(){
        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        HtmlGoodiesHomePagae hp = new HtmlGoodiesHomePagae();

        Actions actions = new Actions(Driver.getDriver());

        actions.
                dragAndDrop(hp.stockholm,hp.sweden).perform();
///geri kalanını yarın yap

    }
}
