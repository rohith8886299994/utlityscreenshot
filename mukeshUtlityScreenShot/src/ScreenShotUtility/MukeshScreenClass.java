package ScreenShotUtility;

import java.io.IOException;

import library.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MukeshScreenClass 
{
	
	@Test
	public void captureScreenshot() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		Utility.captureScreenshot(driver, "max");
	driver.manage().window().maximize();
	
	driver.get("http://www.facebook.com");
	
	Utility.captureScreenshot(driver, "browserandfbopened");
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("8886299994");
	
	Utility.captureScreenshot(driver, "closingbaby");
	
	driver.quit();
	
	
	}

}
