package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Second {
	   @Test
	   public void calls()
	   {
		   Reporter.log("calls",true);
	   }
	   
	   @Test(priority=1)
	   public void setting()
	   {
		   Reporter.log("setting",true);
	   }
	   
	   @Test(priority=-1)
	   public void chats()
	   {
		   Reporter.log("chats",true);
	   }
}
