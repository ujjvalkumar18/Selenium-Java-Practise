package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Bootstramodelwindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumaujjv\\Downloads\\TST\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//A[@id='get_sign_up']")).click();
		driver.switchTo().frame("authiframe");
		driver.findElement(By.xpath("//INPUT[@id='authMobile']")).sendKeys("9840383098");
		driver.findElement(By.xpath("//BUTTON[@id='mobileSubmitBtn']")).click();
	}

}
