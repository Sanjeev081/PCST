package seleniumsession;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class javascriptExicutorconcept {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/bitbyte/Desktop/webdriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://classic.freecrm.com/index.html?e=1"); 
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[1]")).sendKeys("groupautomation");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[2]")).sendKeys("Admin@123");
	WebElement loginbtn=driver.findElement(By.xpath("//input[contains(@type,'text')]"));
	flash(loginbtn,driver); //highlight the element
	
	drawBorder(loginbtn,driver);//draw a  border
	//take screenshot:
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	Files.copy(scrFile, new File("c:\\tmp\\element.png"));
	//Generate Alert
	//generateAlert(driver,"There is an issue with login buttun on login page");
	ClickElementByjs(loginbtn ,driver);//click on any element by using js 
	refeshBrowserbyjs(driver);
	//get the title of the page by js
	System.out.println(getTitleByjs(driver));
	//get the pageText
	System.out.println(getpageInnerText(driver));
	//scroll page down
	//scrollpagedown(driver);
	WebElement forgotpwdLink=driver.findElement(By.xpath("//*[@id=\"footer\"]/div/div/div[1]/p[4]/a"));
	scrollIntoview(forgotpwdLink,driver);
	

	}
	public static void flash(WebElement element,WebDriver driver) {
	JavascriptExecutor js=((JavascriptExecutor)driver);
		String bgcolor=element.getCssValue("backgroundcolor");
		for(int i=0;i<10;i++) {  
			changeColor("rgb(0,200,0)",element,driver);
			changeColor(bgcolor,element,driver);		
		} 
	} 
   public static void changeColor(String color,WebElement element,WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundcolor='"+color+"'", element);
		try { 
			Thread.sleep(20);
		} catch(InterruptedException e) {
			
		}
		
	}
   public static void drawBorder(WebElement element,WebDriver driver) {
	  JavascriptExecutor js=((JavascriptExecutor)driver);
	  js.executeScript("arguments[0].style.border='3px solid red'", element);
	  
	
}
    public static void generateAlert(WebDriver driver ,String message) {
    	JavascriptExecutor js=((JavascriptExecutor)driver);
    	js.executeScript("alert('"+message+"')");
  	  
    	
    }
    public static void ClickElementByjs(WebElement element,WebDriver driver) {
    	JavascriptExecutor js=((JavascriptExecutor)driver);
    	js.executeScript("arguments[0].click();", element); 
    	
    }
    public static void refeshBrowserbyjs(WebDriver driver) {
    	JavascriptExecutor js=((JavascriptExecutor)driver);
    	js.executeScript("history.go(0)");
    }
    public static String  getTitleByjs(WebDriver driver) {
    	JavascriptExecutor js=((JavascriptExecutor)driver);
    	String title=js.executeScript("return document.title;").toString();
    	return title;
    	
    }
    public static String getpageInnerText(WebDriver driver) {
    	JavascriptExecutor js=((JavascriptExecutor)driver);
		String pageText=js.executeScript("return document.documentElement.innerText ;").toString();
		return  pageText;  
    
   
    }
    public static void scrollpagedown(WebDriver driver) {
    	JavascriptExecutor js=((JavascriptExecutor)driver);
    	js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); 
    	 
    	 
    	
    }
    public static void scrollIntoview(WebElement element,WebDriver driver) {
    	JavascriptExecutor js=((JavascriptExecutor)driver);
    	js.executeScript("arguments[0].scrollIntoView(true);",element);
    	
    }
    
  

}
