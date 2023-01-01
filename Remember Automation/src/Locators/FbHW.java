package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbHW {

	public static void main(String[] args) throws InterruptedException {
	

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("chetan");
		driver.findElement(By.name("pass")).sendKeys("sdfg");
		
		Thread.sleep(5000);
		driver.findElement(By.name("login")).click();

	}

}
