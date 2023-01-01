package DragAndDrop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Third {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement abc = driver.findElement(By.id("cars"));
		Select s=new Select(abc);
		s.selectByIndex(0);
		s.selectByValue("99");
		s.selectByVisibleText("More Than INR 500 ( 55 ) ");
		
		System.out.println(s.isMultiple());
		
		Thread.sleep(3000);
		
		if(s.isMultiple()) 
		{
			s.deselectAll();
		}
		
		

	}

}
