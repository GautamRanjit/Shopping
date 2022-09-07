package LibraryFiles;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base
{
	
     public WebDriver driver;
    
	public void intializabrowser() throws IOException
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\Shopping\\Shopping\\Browser\\chromedriver.exe");
			
		    driver=new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   
		   
		   driver.get(utlity.getPFData("URL"));
		   
	}
}
