package clarusway.pages.practicePages;

import clarusway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {


    public AmazonHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id = "nav-logo-sprites")
    public WebElement logo;

    @FindBy(id = "nav-global-location-data-modal-action")
    public WebElement teslimatAdresi;

    @FindBy(id = "searchDropdownBox")
    public WebElement kategori;

    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(id = "nav-link-accountList")
    public WebElement hesaplarVeListe;

    @FindBy(id = "nav-orders")
    public WebElement iadelerVeSiparisler;

    @FindBy(id = "nav-cart")
    public WebElement alisverisSepeti;








}
