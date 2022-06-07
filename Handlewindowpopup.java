package seleniumsession;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlewindowpopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/bitbyte/Desktop/webdriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		Set<String> handler=driver.getWindowHandles();
		Iterator<String>it=handler.iterator();
		String parentwindowId=it.next();
		System.out.println("parent window id"+it.next());
		String childwindowid=it.next();
		System.out.println("child window id"+childwindowid);
		driver.switchTo().window(childwindowid);
		System.out.println("child window pop up title"+driver.getTitle());
		driver.close();
		driver.switchTo().window(parentwindowId);
		System.out.println("parent window title"+driver.getTitle());
		
		
		
		
		
		
		

	}

}
