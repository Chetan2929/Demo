package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.zomato.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@type,'number')]")).sendKeys("8208571021");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Send One Time Password')]")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(3000);
		driver.close();
		

	}

}
