package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLoginPage {
	
	@FindBy (xpath="//input[@name='email']")private WebElement email;
	@FindBy (xpath="//input[@name='pass']")private WebElement passward;
	@FindBy (xpath="//button[@name='login']")private WebElement login;
	@FindBy (xpath="//a[text()='Forgotten password?']")private WebElement forgotpassward;
	@FindBy (xpath="(//a[@role='button'])[2]")private WebElement createaccount;
	@FindBy (xpath="//a[text()='Create a Page']")private WebElement createnewpage;
	
	public FaceBookLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmailId(String mailId)
	{
		email.sendKeys(mailId);
	}
	
	public void enterPassward(String pass)
	{
		passward.sendKeys(pass);
	}
	public void clickOnLogin()
	{
		login.click();
	}
	public void clickOnForgotPassward()
	{
		forgotpassward.click();
	}
	public void clickOnCreateNewAccount()
	{
		createaccount.click();
	}
	public void clickOnCreatePage()
	{
		createnewpage.click();
	}

}
