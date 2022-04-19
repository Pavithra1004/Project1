package Generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_class implements Framework_Constants
{
	private static final String GECKO_KEY = null;
	public static WebDriver driver;
	@BeforeMethod
	public void openapp() throws InterruptedException
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		
	}
	@AfterMethod
	public void closeapp(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Generic_Takescreenshot.getData(driver);
		}
		driver.close();
	}

}
