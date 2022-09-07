package Shopping_Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingproceedtocheckoutPage 
{

	@FindBy(xpath="//a[@class=\"btn btn-default button button-medium\"]") private WebElement ProceedBTN;
	
	

    public ShoppingproceedtocheckoutPage (WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
	
	
	 public void clickonproceed_btn()
	    {
		 ProceedBTN.click();
	    }
}
