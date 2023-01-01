package DragAndDrop;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Second {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement block = driver.findElement(By.name("url"));
		Select s=new Select(block);
		Thread.sleep(3000);
		
		s.selectByIndex(6);
		
		Thread.sleep(3000);
		
		
		s.selectByVisibleText("Electronics");
		
		Thread.sleep(3000);
		
		s.selectByValue("search-alias=nowstore");
		
		List<WebElement> opt = s.getOptions();  // get all options
		System.out.println(opt.size());            // get size
		
		for(WebElement b:opt) {
			System.out.println(b.getText());     // get text printed
		}

	}

}
