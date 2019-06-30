package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HaldleCalenderJavascript {
	private static final String JavaScriptExecutorjs = null;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumaujjv\\Downloads\\TST\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//I[@class='icon-calendar1 ico22 widgetCalIcon '])[1]")).click();
		driver.findElement(By.xpath("//DIV[@id='fare_20180517']")).click();
		/*String date_value="31-12-2017";
		
										}
	public static void Enterdate(WebDriver driver,WebElement date,String date_value){
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript(argument[0].setAttribute('Value','"+date_Value"');", element);*/
	}

}
