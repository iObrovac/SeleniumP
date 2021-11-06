package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
	
	@Test
	public void Login() throws InterruptedException {
		driver.navigate().to("https://cms.demo.katalon.com/");
		Thread.sleep(3000);
		
	}
}
