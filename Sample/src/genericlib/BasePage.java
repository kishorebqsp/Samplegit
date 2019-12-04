package genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	 WebDriver driver;
	public BasePage(WebDriver driver) {/*
		this.driver=driver;*/
		PageFactory.initElements(driver, this);
	}
	
	public void elementtobeclickable(WebDriver driver,WebElement element)
	{
		try {
		WebDriverWait w=new WebDriverWait(driver,5);
		w.until(ExpectedConditions.elementToBeClickable(element));
		}
		catch(Exception e)
		{
			System.out.println("element is clickable");
		}
	}
	
	public void elementtobeselected(WebDriver driver,WebElement element)
	{
		try {
		WebDriverWait w=new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOf(element));
		}
		catch(Exception e)
		{
			System.out.println("element is selected");
		}
	}
	
	

}
