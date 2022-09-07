package Shopping_Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingloginPage 
{

	@FindBy(xpath="//input[@id=\"email\"]") private WebElement UN;
	@FindBy(xpath="//input[@id=\"passwd\"]") private WebElement PWD;
	@FindBy(xpath="//button[@id=\"SubmitLogin\"]") private WebElement BTN;
	
	
    public ShoppingloginPage (WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void setShopping_username(String username)
    {
    	UN.sendKeys(username);
    }
    public void setShopping_password(String password)
    {
    	PWD.sendKeys(password);
    }
    public void clickShopping_btn()
    {
    	BTN.click();
    }

}
