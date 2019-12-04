package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import genericlib.BasePage;

public class Homepage extends BasePage {
	
	
	
	public Homepage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//div[.='USERS']")
	private WebElement users;
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	public void usernamebtb(String username)
	{
		users.sendKeys(username);
	}
	
	public void logoutbtn()
	{
		logout.click();
	}
	

}
