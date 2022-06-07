package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class pageTest {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
		DriverInit	instanceDriver=DriverInit.getInstance();
		instanceDriver.openBrowser();
		
	}
	@Test
	public void Testmethod() {
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
