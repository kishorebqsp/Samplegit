package genericlib;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdown {
	
	public void selectclass(WebElement ele,String text)
	{
		try {
	Select s=new Select(ele);
	s.selectByVisibleText(text);
		}
		catch(Exception e)
		{
		System.out.println("option is present");
		Assert.fail();
		}
	}

}
