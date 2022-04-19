package Generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Generic_Takescreenshot 
{
	private static final String Photos = null;

	public static void getData(WebDriver driver) throws IOException
	{
		String Photo="./Photos";
		Date d=new Date();
		String d1=d.toString();
		String d2=d1.replace(":","-");
		TakesScreenshot tss=(TakesScreenshot)driver;
		File src=tss.getScreenshotAs(OutputType.FILE);
		File dst=new File(Photos+d2+"jpeg");
		FileHandler.copy(src, dst);
		
		
		
			
			
	}
}
