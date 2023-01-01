package New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windomanagment {

	public static void main(String[] args) throws InterruptedException {
		
		//miximize mode
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		
		Thread.sleep(3000);
		
	//full screen
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		
		//minimize mode
		driver.manage().window().minimize();
		
		
		

	}

}
