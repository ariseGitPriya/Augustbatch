package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brawser {
	public static WebDriver openChrome(String url)
	{
		System.setProperty("webdriver.chrome.driver","D:\\AugestBatch1\\NewChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
		
	}

}
