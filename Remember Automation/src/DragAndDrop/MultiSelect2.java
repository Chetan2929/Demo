package DragAndDrop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement abc = driver.findElement(By.id("cars"));
		Select s=new Select(abc);
		Thread.sleep(3000);
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByValue("199");
		Thread.sleep(3000);
		s.selectByVisibleText("INR 200 - INR 299 ( 3 ) ");
		
		//deselction
		Thread.sleep(3000);
		s.deselectByIndex(2);
		
		Thread.sleep(3000);
		s.deselectByValue("199");
		Thread.sleep(3000);
		s.deselectByVisibleText("INR 200 - INR 299 ( 3 ) ");

	}

}
