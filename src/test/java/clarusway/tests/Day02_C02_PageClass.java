package clarusway.tests;

import clarusway.pages.SoucedemoHomePage;
import clarusway.pages.SoucedemoLoginPage;
import clarusway.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

public class Day02_C02_PageClass {

    @Test
    public void pageClassTest(){
        Driver.getDriver().get("https://www.saucedemo.com/");
        SoucedemoLoginPage loginPage = new SoucedemoLoginPage();
        loginPage.txtUsername.sendKeys("standard_user");
        loginPage.txtPassword.sendKeys("secret_sauce");
        loginPage.btnLogin.click();

    //burada homepage gecis yapildi
        SoucedemoHomePage homePage = new SoucedemoHomePage();
        Select select = new Select(homePage.filterDropDown);
        select.selectByValue("lohi");

        homePage.products.forEach(t-> System.out.println(t.getText()));


    }
}
