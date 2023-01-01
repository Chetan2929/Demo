package DragAndDrop;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class First {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		
		Select s=new Select(dropdown);
		s.selectByIndex(8);
		
		Thread.sleep(4000);
		s.selectByValue("58058");
		Thread.sleep(4000);
		s.selectByVisibleText("Consumer Electronics");
		
		List<WebElement> opt = s.getOptions();
		System.out.println(opt.size());
		
		for(WebElement b:opt) {
			System.out.println(b.getText());
		}
		
	}

}
