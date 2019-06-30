package SeleniumBasic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadpopup {

	public static void main(String[] args) throws InterruptedException, IOException{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumaujjv\\Downloads\\TST\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new  ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(3,TimeUnit.MILLISECONDS);
	    driver.get("https://www.freepdfconvert.com/");
	    //driver.get("https://www.freepdfconvert.com/");
	    //driver.findElement(By.id("clientUpload")).click();
	   // Thread.sleep(3000);
	    //Runtime.getRuntime().exec("C:\\Users\\kumaujjv\\Desktop\\upload1.exe");
	    driver.findElement(By.id("clientUpload")).sendKeys("C:\\Resume\\60132788 17-18.pdf");
	    driver.close();
	}
}
	    