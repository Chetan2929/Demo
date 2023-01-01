package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.netty.channel.ChannelOption;

public class Notification2 {

	public static void main(String[] args) {
		
		//chrome
		ChromeOptions options=new ChromeOptions ();
		options.addArguments("--disable-notification");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

	}

}
