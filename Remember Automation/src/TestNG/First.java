package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class First {

	@Test
	public void demo()
	{
		Reporter.log("Hello java ",true);
		Reporter.log("Hello selenium ",false);
		
	}

}
