package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Second {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://luxire.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement abs = driver.findElement(By.className("drawerbtn"));
		
		Actions a=new Actions (driver);
		a.moveToElement(abs).perform();
		
		driver.findElement(By.xpath("(//a[text()='Suits'])[2]")).click();
	}

}
