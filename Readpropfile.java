package seleniumsession;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Readpropfile {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream("/Users/bitbyte/eclipse-workspace/seleniumsession/src/seleniumsession/config.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		String url=prop.getProperty("url");
		System.out.println(url);
		String browser=prop.getProperty("browser");
		System.out.println(browser);
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/bitbyte/Desktop/webdriver/chromedriver");
			driver=new ChromeDriver();
		}else if(browser.equals("FF")) {
			System.setProperty("webdriver.chrome.driver", "/Users/bitbyte/Desktop/webdriver/gickdriver");
			driver=new FirefoxDriver();
		}else if(browser.equals("IE")) {
			System.setProperty("webdriver.chrome.driver","/Users/bitbyte/Desktop/webdriver/internetexporedriverdriver");
			driver=new InternetExplorerDriver();
		}
		driver.get(url);
//		driver.findElement(By.xpath(prop.getProperty("firstnamexpath"))).sendKeys(prop.getProperty("firstname"));
//		driver.findElement(By.xpath(prop.getProperty("lastnamexpath"))).sendKeys(prop.getProperty("Latname"));
//		driver.findElement(By.xpath(prop.getProperty("emailxpath"))).sendKeys(prop.getProperty("Email"));
//		driver.findElement(By.xpath(prop.getProperty("phonenoxpath"))).sendKeys(prop.getProperty("mobno"));
//		driver.findElement(By.xpath(prop.getProperty("pswxpath"))).sendKeys(prop.getProperty("psw"));
		driver.findElement(By.xpath(prop.getProperty("usernamexpath"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath(prop.getProperty("passwordxpath"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("loginxpath"))).click();
		
	}

}
