package basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class New {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		Thread.sleep(10000);
		driver.close();

	}

	}

}
