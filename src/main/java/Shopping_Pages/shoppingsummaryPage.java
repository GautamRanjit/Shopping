package Shopping_Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shoppingsummaryPage 
{

@FindBy(xpath="//a[@class=\"button btn btn-default standard-checkout button-medium\"]") private WebElement SummaryProceedBTN;
	
	

    public shoppingsummaryPage (WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
	
	
	 public void clickonproceed_btn()
	    {
		 SummaryProceedBTN.click();
	    }
	
}
