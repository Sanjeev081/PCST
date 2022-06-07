package seleniumsession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstautomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/bitbyte/Desktop/webdriver98/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://oneoncloud.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("identity")).sendKeys("IN-0685-00000001");
		driver.findElement(By.name("password")).sendKeys("IN-0685-00000001");
		driver.findElement(By.xpath("//*[@id=\"demo-form\"]/fieldset/button")).click();

	}

}
