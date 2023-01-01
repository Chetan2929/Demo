package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) throws IOException {
		
		Properties p=new Properties();   //here we creat the object 
		FileInputStream fis=new FileInputStream("./data.properties");   // here we create object and provide properties
		p.load(fis);
		
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys(p.getProperty("username"));
		driver.findElement(By.name("pwd")).sendKeys(p.getProperty("password"));
	}

}
