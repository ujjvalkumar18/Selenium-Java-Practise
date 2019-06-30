package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\kumaujjv\\Downloads\\TST\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			JavascriptExecutor js=(JavascriptExecutor) driver;
			driver.get("http://demo.guru99.com/test/guru99home/");
			driver.manage().window().maximize();
		
			/*Scroll from Top to Bottom using Scroll function
			 js.executeScript("window.scrollBy(0,250)");
			//Thread.sleep(2000);
			//js.executeScript("window.scrollBy(1000,0)");
			//js.executeScript("window.scrollBy(0,250)", "");*/
			
			
			/*Scroll using Visibility of Element
			WebElement ele=driver.findElement(By.linkText("Linux"));
			js.executeScript("arguments[0] ScrollIntoview();",ele);
			Thread.sleep(2500);*/
			
			//scroll to the bottom of the page
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(2000);
			driver.close();	
			
	}

}
