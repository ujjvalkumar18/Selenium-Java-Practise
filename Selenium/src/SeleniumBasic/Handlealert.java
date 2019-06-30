package SeleniumBasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Handlealert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumaujjv\\Downloads\\TST\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ksrtc.in/oprs-web/");
		driver.findElement(By.xpath("//INPUT[@id='searchBtn']")).click();
		Thread.sleep(2000);
	    Alert alt=driver.switchTo().alert();
		//alt.accept();to accept the alert window
	    //alt.dismiss();to cancel the alert window
	    String actual_msg=alt.getText();
	    System.out.println("original Msg "+ actual_msg);
	    alt.accept();
	    String expected_Msg="Please select start place.";
	    Assert.assertEquals(actual_msg, expected_Msg);    
	}
}
