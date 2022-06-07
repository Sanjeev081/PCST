package seleniumsession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlesschromeTest {

	public static void main(String[] args) {
	
			System.setProperty("webdriver.chrome.driver", "/Users/bitbyte/Desktop/webdriver/chromedriver");
			ChromeOptions options=new ChromeOptions();
			options.addArguments("window-size=1400,800");
			options.addArguments("headless");
			WebDriver driver=new ChromeDriver(options);
		
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
		   driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   driver.get("https://oneoncloud.com/");
		   System.out.println("login page Title==="+driver.getTitle());
		   driver.findElement(By.xpath("//*[@id=\"demo-form\"]/fieldset/div[1]/input")).sendKeys("IN-0685-00000001");
		   driver.findElement(By.xpath("//*[@id=\"demo-form\"]/fieldset/div[2]/input")).sendKeys("IN-0685-00000001");
		   driver.findElement(By.xpath("//*[@id=\"demo-form\"]/fieldset/button")).click();
		   System.out.println("Hoem page title=="+driver.getTitle());
		   
		   
		    

	}

}
