package seleniumsession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Htmldriverconcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/bitbyte/Desktop/webdriver/chromedriver");
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new HtmlUnitDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://oneoncloud.com/");
		System.out.println("Before login title is:"+driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"demo-form\"]/fieldset/div[1]/input")).sendKeys("IN-0685-00000001");
		driver.findElement(By.xpath("//*[@id=\"demo-form\"]/fieldset/div[2]/input")).sendKeys("IN-0685-00000001");
		driver.findElement(By.xpath("//*[@id=\"demo-form\"]/fieldset/button")).click();
	
		System.out.println("After login title is"+driver.getTitle());
		
		
		
		

	}

}
