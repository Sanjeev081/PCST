package seleniumsession;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/bitbyte/Desktop/webdriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://makemysushi.com/404?");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJZDxU')]"));
		//driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]")).click();
		//1. get the list of all the links and images
		List<WebElement> Linklist=driver.findElements(By.tagName("a"));
		Linklist.addAll(driver.findElements(By.tagName("img")));
		System.out.println("size of full links and images--->"+Linklist.size());
	
		List<WebElement> activelinks=new ArrayList<WebElement>();
		//2. itrate linksList;
		for(int i=0;i<Linklist.size();i++) {
			//System.out.println(Linklist.get(i).getAttribute("href"));
			if(Linklist.get(i).getAttribute("href") !=null) {
				activelinks.add(Linklist.get(i));
			}
		}
		//get the size of active links list:
		System.out.println("size of active links and images--->"+activelinks.size());
		//3. check the href url,with httpconnection api:
		for(int j=0;j<activelinks.size();j++) {
			HttpURLConnection connection=	(HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response=connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activelinks.get(j).getAttribute("href")+"----->"+response);
		}
		
		

	}

}
