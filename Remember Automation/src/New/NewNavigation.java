package New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewNavigation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		
		
		Thread.sleep(5000);
		
		driver.navigate().to("https://skillrary.com/");
		
		//back
		driver.navigate().back();
		
		//forward
		driver.navigate().forward();
		
		//refresh
		driver.navigate().refresh();
		
		

	}

}
