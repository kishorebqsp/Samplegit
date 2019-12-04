package scripts;

import org.testng.annotations.Test;

import genericlib.Initalizier;
import pom.Loginpage;

public class Validlogin extends Initalizier{
	
	

	@Test
	public void login() throws InterruptedException
	{
//		Thread.sleep(6000);
//		loginp.usernametb("Admin");
//		Thread.sleep(6000);
//		loginp.passwordtb("manager");
//		Thread.sleep(6000);
//		loginp.loginbtn();
		
		Loginpage l=new Loginpage(driver);
//		Thread.sleep(6000);
		loginp.usernametb("Admin");
		Thread.sleep(6000);
		l.passwordtb("manager");
		Thread.sleep(6000);
		l.loginbtn();
		
	}

}
