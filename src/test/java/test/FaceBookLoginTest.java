package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pojo.Brawser;
import pom.FaceBookLoginPage;
@Listeners(test.Listeners.class)
public class FaceBookLoginTest {
	WebDriver driver;
	
	@BeforeMethod
	
	public void LaunchBraw()
	{
		driver=Brawser.openChrome("https://www.facebook.com/");
	}
	
	@Test
	public void LoginWithValidUserNameAndPassward()
	{
		FaceBookLoginPage facebookloginpage = new FaceBookLoginPage(driver);
		facebookloginpage.enterEmailId("arise@gmail.com");
		facebookloginpage.enterPassward("123456");
	}
	
	@Test
	public void LoginWithInvalidUserNameAndValidPassward()
	{
		FaceBookLoginPage facebookloginpage = new FaceBookLoginPage(driver);
		facebookloginpage.enterEmailId("goodluck@gmail.com");
		facebookloginpage.enterPassward("123456");
		
	}
	@Test
	public void LoginWithValidUserNameAndInvalidPassward()
	{
		FaceBookLoginPage facebookloginpage = new FaceBookLoginPage(driver);
		facebookloginpage.enterEmailId("arise@gmail.com");
		facebookloginpage.enterPassward("11111111");
	}
	@AfterMethod
	public void closebrawser()
	{
		driver.close();
	}
	

}
