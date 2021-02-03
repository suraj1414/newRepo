package actiTimeTest;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//author suraj hiiiiii
public class ActiTimeTestValidLogin {
	WebDriver driver;
	String urlApp="http://laptop-smc8hiai/login.do";
	
	@BeforeClass
	public void setUP()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(urlApp);
		
		
	}
	///this methpd is used for soimethkmsd
	
	@Test
	public void testActiTime()
	{
		
		
		String loginTitle = driver.getTitle();
		Assert.assertEquals(loginTitle, "actiTIME - Login");
		Reporter.log("The loginPage title is Verified and the test script is successful",true);
		
	}
	
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
