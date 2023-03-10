package clarusway.pages;

import clarusway.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HtmlGoodiesHomePagae {

    public HtmlGoodiesHomePagae(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id = "box2")
    public WebElement stockholm;
    @FindBy(id = "box3")
    public WebElement Washington;
    @FindBy(id = "box4")
    public WebElement copenhag;
    @FindBy(id = "box5")
    public WebElement seul;
    @FindBy(id = "box6")
    public WebElement rome;
    @FindBy(id = "box7")
    public WebElement madrid;
    @FindBy(id = "box1")
    public WebElement oslo;

    @FindBy(id = "box107")
    public WebElement spain;

    @FindBy(id = "box101")
    public WebElement norway;

    @FindBy(id = "box104")
    public WebElement denmark;

    @FindBy(id = "box105")
    public WebElement sKorea;

    @FindBy(id = "box102")
    public WebElement sweden;

    @FindBy(id = "box103")
    public WebElement us;

}
