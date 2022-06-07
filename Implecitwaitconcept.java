package seleniumsession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implecitwaitconcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/bitbyte/Desktop/webdriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); 
	

	}

}
