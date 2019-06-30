package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class VerifyErrormessage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumaujjv\\Downloads\\TST\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.naukri.com/nLogin/Login.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//INPUT[@id='sbtLog']")).click();
		Thread.sleep(1000);
		String actual_msg=driver.findElement(By.xpath("//I[@id='emailTxt_err']")).getText();
		String expect_msg="Please specify your Email ID";
		Assert.assertEquals(actual_msg, expect_msg);
		
	}

}
