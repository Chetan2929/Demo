package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args)   {
		// throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		//Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("chetan");
		//Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("123456");
	 //	Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if(title.equals("Login • Instagram")) {     //Veriification
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		
		}
		driver.close();
		

	}

}
