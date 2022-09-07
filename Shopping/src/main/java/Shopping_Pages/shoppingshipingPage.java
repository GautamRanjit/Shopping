package Shopping_Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shoppingshipingPage
{


    @FindBy(xpath="//input[@type=\"checkbox\"]") private WebElement CheckdBTN;
    @FindBy(xpath="//button[@class=\"button btn btn-default standard-checkout button-medium\"]") private WebElement proceedBTN;
	
	

    public shoppingshipingPage (WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
	
	
	 public void clickonproceed_btn()
	    {
		 CheckdBTN.click();
		 proceedBTN.click();
	    }
}
