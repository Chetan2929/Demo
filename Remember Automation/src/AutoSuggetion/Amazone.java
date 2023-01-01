package AutoSuggetion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazone {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("phones");
		
		Thread.sleep(4000);
		List<WebElement> ele1 = driver.findElements(By.className("s-heavy"));
		//count the option
		System.out.println(ele1.size());
		
		//print the option
		for(WebElement b:ele1)
		{
			System.out.println(b.getText());
		}
         driver.close();
	}

}
