package ScrollBar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.xpath("//img[contains(@alt,'Physics Wallah')]"));
		Point p = ele.getLocation();
		int x = p.getX();
		int y = p.getY();
		
		//typecasting
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");   
		
		Thread.sleep(3000);
		
		ele.click();
		//to perform click using JAVA SCript executor
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click;",ele);

	}

}
