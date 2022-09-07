package Shopping.Shopping;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryFiles.base;
import LibraryFiles.utlity;
import Shopping_Pages.ShoppingHomePage;
import Shopping_Pages.ShoppingPaymentPage;
import Shopping_Pages.ShoppingaddressPage;
import Shopping_Pages.Shoppingconformorder;
import Shopping_Pages.ShoppingloginPage;
import Shopping_Pages.ShoppingproceedtocheckoutPage;
import Shopping_Pages.shoppingshipingPage;
import Shopping_Pages.shoppingsummaryPage;

public class ShoppingorderTest extends base
{

	ShoppingHomePage cart;
	ShoppingproceedtocheckoutPage check;
	shoppingsummaryPage   summary;
	ShoppingloginPage login;
	ShoppingaddressPage add;
	shoppingshipingPage ship;
	ShoppingPaymentPage payment;
	Shoppingconformorder status;
	int TCID;
	

	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException
	{		
		   intializabrowser();
	
		   cart=new ShoppingHomePage(driver) ;
		   check = new ShoppingproceedtocheckoutPage(driver);
		   summary=new shoppingsummaryPage(driver);
		   login=new ShoppingloginPage(driver);
		   add=new  ShoppingaddressPage(driver);
		   ship=new shoppingshipingPage(driver);
		   payment=new ShoppingPaymentPage(driver);
		   status=new Shoppingconformorder(driver);
		   
		   
	
	}
	@BeforeMethod
	public void orderplace() throws EncryptedDocumentException, IOException, InterruptedException
	{
		cart.setShopping_cloths(utlity.getid(0, 1));
		cart.clickShopping_btn();
		cart.addtocart(driver);
		check.clickonproceed_btn();
		summary.clickonproceed_btn();
		login.setShopping_username(utlity.getPFData("UN"));
		login.setShopping_password(utlity.getPFData("PWD"));
		login.clickShopping_btn();
		add.clickonproceed_btn();
		ship.clickonproceed_btn();
		payment.clickonproceed_btn();
		status.clickonconformorder_btn();
		
		
		
	}
	
		
	@Test
	public void orderstatusverify() throws IOException
	{
		
	    String act=status.statusgain();
	    String exp=utlity.getid(1, 1);
	    
	    Assert.assertEquals(act, exp);
		
	}
		
	
	@AfterMethod
	public void logoutFromApp(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE) 
		{
			utlity.captureScreenshot(driver, TCID);
		}
		
	
				
	}
}
