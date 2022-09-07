package Shopping_Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingHomePage 
{

	@FindBy(xpath="//input[@id=\"search_query_top\"]") private WebElement searchitems;
	@FindBy(xpath="(//button[@type=\"submit\"])[1]") private WebElement BTN;
	@FindBy(xpath="//div[@class=\"product-container\"]") private WebElement shirt;
	@FindBy(xpath="//a[@class=\"button ajax_add_to_cart_button btn btn-default\"]") private WebElement Addtocart;
	
    public ShoppingHomePage (WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void setShopping_cloths(String items)
    {
    	searchitems.sendKeys(items);
    }
    public void clickShopping_btn()
    {
    	BTN.click();
    }
    public void addtocart(WebDriver driver)
    {
    	Actions act=new Actions(driver);
    	act.moveToElement(shirt).click(Addtocart).build().perform();
    }
    
    
    
}
