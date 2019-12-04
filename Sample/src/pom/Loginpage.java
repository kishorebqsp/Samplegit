package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import genericlib.BasePage;

public class Loginpage extends BasePage {
	public Loginpage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="username")
	private WebElement usertb;
	
	@FindBy(name="pwd")
	private WebElement pwdtb;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement login;
	
	public void usernametb(String username)
	{
		usertb.sendKeys(username);
	}
	
	public void passwordtb(String password)
	{
		pwdtb.sendKeys(password);
	}
	
	public void loginbtn()
	{
		login.click();
	}

}
