package DragAndDrop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect3 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement dd = driver.findElement(By.id("cars"));
		Select s=new Select(dd);
		s.selectByIndex(2);
		s.selectByValue("199");
		s.selectByVisibleText("INR 200 - INR 299 ( 3 ) ");
		
		//deselection
		

		s.deselectByIndex(2);
		s.deselectByValue("199");
		s.deselectByVisibleText("INR 200 - INR 299 ( 3 )");

	}

}
