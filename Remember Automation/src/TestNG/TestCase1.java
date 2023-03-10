package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 {

	public WebDriver driver ;         //WebDriver declare globally so it can access
	@BeforeMethod
	public void openApp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		} 
	                                        //Fb login script with testNG
	@Test
	public void tc1()
	{
		driver.findElement(By.name("email")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("manager");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
		Reporter.log(title,true);
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}

}
