package SeleniumBasic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt {
	public static void main(String[] args) throws InterruptedException, IOException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumaujjv\\Downloads\\TST\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new  ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(700,TimeUnit.MILLISECONDS);
	    driver.get("http://tinypic.com/");
	    driver.findElement(By.xpath("//*[@id='the_file']")).click();
	   Thread.sleep(3000);
	    //Runtime.getRuntime().exec("C:\\Users\\kumaujjv\\Desktop\\tiny.exe");
	    //driver.close();
	}
	
}