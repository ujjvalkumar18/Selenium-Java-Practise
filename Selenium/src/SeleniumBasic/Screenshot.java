package SeleniumBasic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumaujjv\\Downloads\\TST\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("selenium");
		//Take a screenshot and save as a file
		File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
		  // now copy the  screenshot to desired location using copyFile method
		 
		 Files.copy(src, new File("C:\\Users\\kumaujjv\\Desktop\\Project\\google.png"));
		       }
		 
		catch (IOException e)
		 
		{
		
		System.out.println(e.getMessage());
		 
		    }
		 
		}

	}

