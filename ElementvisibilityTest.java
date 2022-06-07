package seleniumsession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementvisibilityTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/bitbyte/Desktop/webdriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://api.cogmento.com/register/");
		
		//1. isDisplayed() method:applicable for all elements
		boolean b1=driver.findElement(By.id("email")).isDisplayed();
		System.out.println(b1);//true
		
		//2. isenabled()method:
		boolean b2=driver.findElement(By.id("email")).isEnabled(); 
		System.out.println(b2);//false 
		
		//3.Select i agree checkbox:
        //driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
        //3. isselected method: only Applicabe for checkbox ,dropdown,rediobutton
       //boolean b3= driver.findElement(By.xpath("//*[@id=\"terms\"]")).isSelected();
      // System.out.println(b3);
        //deselect the checkbox
        boolean b3= driver.findElement(By.xpath("//*[@id=\"terms\"]")).isSelected();
         System.out.println(b3); //false
        
       
       
        
        
       
	}

} 
