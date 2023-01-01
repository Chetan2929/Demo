package Popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopupCase1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//to get parent browser address
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		
		//case no.1
		driver.switchTo().newWindow(WindowType.TAB);// here switch  the control to next window, two diff tab lauch
		driver.navigate().to("https://kissanime.com.ru/"); //here both application are lauch in same tab, here in one tab two application is lauch

		//to get address of parent and child
				Set<String> child = driver.getWindowHandles();
				System.out.println(child);
				
				//driver.close();  // with this child browser close
				driver.quit();    // both parent and child browser is close
	}

}
