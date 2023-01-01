package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

public class Copyforcase2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String parent = driver.getWindowHandle();
	
driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
driver.findElement(By.xpath("(//a[text()=' SkillRary Demo APP'])[2]")).click();

 java.util.Set<String> child = driver.getWindowHandles();

for(String b:child) {
	driver.switchTo().window(b);
}


driver.findElement(By.xpath("(//a[text()='Selenium Training'])[2]")).click();

driver.switchTo().window(parent);	
	
	
	}

	}


