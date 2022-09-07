package Shopping_Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingPaymentPage 
{


@FindBy(xpath="//a[@class=\"bankwire\"]") private WebElement PaymentBTN;
	
	

    public ShoppingPaymentPage  (WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
	
	
	 public void clickonproceed_btn()
	    {
		 PaymentBTN.click();
	    }
}
