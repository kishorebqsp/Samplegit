/*package genericlib;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Photo {
	public void getphoto(WebDriver driver,String path)
	{
		
	try
	{
		Date d=new Date();
		String s = d.toString();
		String date = s.replaceAll(":","-");
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File(path+date+".png");
		FileUtils.copyFile(src,dest);
	}
	catch(Exception e)
	{
		System.out.println("screenshort is not taken");
		Assert.fail();
	}
		
	}

}
*/