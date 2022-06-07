package seleniumsession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectcalendarbyjs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/bitbyte/Desktop/webdriver/chromedriver");
		WebDriver driver=new ChromeDriver();
	
   driver.manage().window().maximize();
   driver.manage().deleteAllCookies();
	   driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.get("https://www.spicejet.com/");
	   WebElement date=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[4]/div/div/div[1]/div[2]/div[1]"));
	   String dateval="30-04-2022";
	   selectDateByjs(driver,date,dateval);
	   

	}
	public static void selectDateByjs(WebDriver driver,WebElement element,String dateval  ) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateval+"'); ", element);
		
	}

}
