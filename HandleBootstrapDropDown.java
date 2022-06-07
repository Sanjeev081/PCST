package seleniumsession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBootstrapDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/bitbyte/Desktop/webdriver/chromedriver");
		WebDriver driver=new ChromeDriver();
	
   driver.manage().window().maximize();
   driver.manage().deleteAllCookies();
	   driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
	   
	   driver.findElement(By.xpath("//*[@id=\"dropdownMenuLink\"]")).click();
	  List<WebElement> list= driver.findElements(By.xpath("//div[@class='dropdown-menu' and @aria-labelledby='dropdownMenuButton']//a"));
	  System.out.println(list.size());
//	  //Selecting Angular option
//         for(int i=0;i<list.size();i++) { 
//		  
//		  System.out.println( list.get(i).getText());
//		  if(list.get(i).getText().equals("Another action")) {
//			  list.get(i).click();
//			  break;
//		  }
//	  }
//	   
	   //selecting all the checkbox/options
	  for(int i=0;i<list.size();i++) {
		System.out.println(  list.get(i).getText());
		if(list.get(i).getText().equals("Another action")) {
			list.get(i).click();
			break;
			
		}
		
	  }
	   

	} 

}
 