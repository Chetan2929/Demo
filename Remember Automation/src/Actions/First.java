package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class First {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement abc = driver.findElement(By.xpath("(//a[text()='Electronics'])[2]"));
		
		Actions a=new Actions(driver);
		a.moveToElement(abc).perform();
		
		driver.findElement(By.xpath("//a[text()='Smart watches']")).click();

	}

}
