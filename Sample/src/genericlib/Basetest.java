package genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest implements Autoconstant {

	public WebDriver driver;
//	public Initalizier p;

//	@BeforeTest
//	public void init()
//	{
//		p=new Initalizier(driver);
//		PageFactory.initElements(driver,this);
//	}
//	
	
	@BeforeMethod
	public void openapp() {
		System.setProperty(Key, Value);
		driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");

	}

	@AfterMethod
	public void closeapp() {
		driver.close();
	}
}
