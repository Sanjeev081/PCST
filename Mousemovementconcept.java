package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemovementconcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/bitbyte/Desktop/webdriver101/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://bitbyte-it-services-bbt.web.app/");
//	driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
//	Actions action=new Actions(driver);
//	action.moveToElement(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/span[3]"))).build().perform();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body")).click();
//	driver.manage().window().maximize();
//		

		

	}

}
