package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateScript {



	public static void main(String[] args) throws InterruptedException {
	
		//step 1 open the browser
		WebDriver driver=new ChromeDriver();
		
		//step 2 maximize the browser
		driver.manage().window().maximize();
		
		//step 3 enter the url
		driver.get("https://demo.actitime.com/login.do");
		
		Thread.sleep(3000);
		//step 4 enter the valid username
		driver.findElement(By.id("username")).sendKeys("admin");
		
		Thread.sleep(3000);
		//step 5 enter the valid password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		
		Thread.sleep(3000);
		//step 6 click on login button
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		//step 7 get the titel
		String title = driver.getTitle();
		System.out.println(title);
		
		//step 8 get current url
		String url = driver.getCurrentUrl();
	     System.out.println(url);
	     
	     //step 9 verification
	     if(title.equals("actiTIME - Login")) {
	    	 System.out.println("Pass HOME page display ho gaya meri jaan");
	     }
	     else
	     {
	    	 System.out.println("fail ho gaya meri jaan");
	     }
	     
	     //step 10 close
	     driver.close();

	}

}
