package clarusway.pages;

import clarusway.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SoucedemoLoginPage {
    //initElements methodu Page class i initialize etmek adine kullanilir
    public SoucedemoLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    // @Findby annatosyonu elemenleri locate ederken kullandıgımız ve initElements ile elemntlerin bulunmasini sağyayan bir anatosyon
    @FindBy(id = "user-name")
    public WebElement txtUsername;
    @FindBy(id="password")
    public WebElement txtPassword;
    @FindBy(xpath = "//*[@id='login-button']")
    public WebElement btnLogin;

    //ornek olmasi icisinden @findAll anatation kullanimi pgae classtan bagımsızdir

    @FindAll({
            @FindBy(id = "user-name"),
            @FindBy(id="password"),
            @FindBy(xpath = "//*[@id='login-button']")
    })
    public List<WebElement> inputElements;





}
