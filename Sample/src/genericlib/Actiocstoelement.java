package genericlib;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Actiocstoelement {
	public void mouseactions(WebDriver driver,WebElement target)
	{
		try
		{
			Actions a=new Actions(driver);
			a.moveToElement(target).perform();
			
		}
		catch(Exception e)
		{
			System.out.println("mouse action cant be performed");
			Assert.fail();
		}
	}

}
