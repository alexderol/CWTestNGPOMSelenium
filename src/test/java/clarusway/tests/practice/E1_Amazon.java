package clarusway.tests.practice;

import clarusway.pages.practicePages.AmazonHomePage;
import clarusway.utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class E1_Amazon {
    @Test
    public void test01(){
        Driver.getDriver().get("https://amazon.com.tr");
        AmazonHomePage homePage = new AmazonHomePage();
        homePage.aramaKutusu.sendKeys("lotto spor ayakkabı"+ Keys.ENTER);
        homePage.logo.click();

    }

}
