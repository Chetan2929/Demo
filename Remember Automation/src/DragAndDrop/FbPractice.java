package DragAndDrop;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbPractice {

	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		 
		 WebElement abc = driver.findElement(By.id("month"));
		 Select s=new Select(abc);
		 s.selectByIndex(0);
		 s.selectByValue("4");
		 s.selectByVisibleText("Jun");
		 //count options
		 List<WebElement> option = s.getOptions();
		 System.out.println(option.size());
		 
		 ArrayList a=new ArrayList();
		 
		 //to print the text
		 for(WebElement c:option)
		 {
			 String text = c.getText();
			 System.out.println(text);
			 a.add(text);
			 
		 }
		 System.out.println(s.isMultiple());
		 
		 System.out.println("*********sortin***************");
		 
	 Collections.sort(a);
		
		for (Object opt:a)
			
		{
			System.out.println(opt);
		}
		driver.close();
		

	}

}
