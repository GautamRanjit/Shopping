package Shopping_Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingaddressPage 
{
	

@FindBy(xpath="//button[@class=\"button btn btn-default button-medium\"]") private WebElement AddressProceedBTN;
	
	

    public ShoppingaddressPage (WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
	
	
	 public void clickonproceed_btn()
	    {
		 AddressProceedBTN.click();
	    }

}
