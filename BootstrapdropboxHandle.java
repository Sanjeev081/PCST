package seleniumsession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapdropboxHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/bitbyte/Desktop/webdriver/chromedriver");
		WebDriver driver=new ChromeDriver();
	
   driver.manage().window().maximize();
   driver.manage().deleteAllCookies();
	   driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	  
	  
	   
	   driver.findElement(By.xpath(" //button[contains(@class,'multiselect dropdown-toggle btn btn-default')]")).click();
	  List<WebElement> list= driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container dropdown-menu')]//a//label"));
	  System.out.println(list.size());
//	  for(int i=0;i<list.size();i++) {
//		  //Selecting Angular option
//		  
//		  System.out.println( list.get(i).getText());  
//	  if(list.get(i).getText().contains("Angular")) {
//		  list.get(i).click();
//		  break;
//			  
//			  //selcting all the checkboxes/option
//		  
//			  
//		  }
//	  }
	  
         for(int i=0;i<list.size();i++) {
        	 System.out.println(list.get(i).getText());
        	 list.get(i).click();
         }
	  
			  
	  

	}

}
