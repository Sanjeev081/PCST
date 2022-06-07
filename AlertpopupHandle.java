package seleniumsession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertpopupHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/bitbyte/Desktop/version103/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/input[2]")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		String text=alert.getText();
		if(text.equals("please enter a valid user name")) {
			System.out.println("correct alert message");
			
		}else {
			System.out.println("incorrect alert message");
		}
		alert.accept();
		
		

	}

}
