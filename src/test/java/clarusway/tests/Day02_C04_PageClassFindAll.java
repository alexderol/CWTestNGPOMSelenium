package clarusway.tests;

import clarusway.pages.SoucedemoHomePage;
import clarusway.pages.SoucedemoLoginPage;
import clarusway.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day02_C04_PageClassFindAll {
    @Test
    public void test(){
        Driver.getDriver().get("https://www.saucedemo.com/");
        SoucedemoLoginPage lp = new SoucedemoLoginPage();
        Assert.assertEquals(3,lp.inputElements.size());
    }
}
