package Shopping_Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shoppingconformorder 
{

@FindBy(xpath="//button[@class=\"button btn btn-default button-medium\"]") private WebElement ConfirmBTN;
@FindBy(xpath="(//div[@class=\"box\"]//strong)[1]") private WebElement status;
	
	

    public Shoppingconformorder  (WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
	
	
	 public void clickonconformorder_btn()
	    {
		 ConfirmBTN.click();
	    }
	 
	 public String statusgain()
	 {
		String Status= status.getText();
		 return Status;
	 }

}
