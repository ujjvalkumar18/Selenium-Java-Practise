package SeleniumBasic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItWindowAuthentication {

		public static void main(String[] args) throws InterruptedException, IOException{
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\kumaujjv\\Downloads\\TST\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver=new  ChromeDriver();
		    driver.manage().window().maximize();
		    //driver.manage().timeouts().implicitlyWait(700,TimeUnit.MILLISECONDS);
		    Runtime.getRuntime().exec("C:\\Users\\kumaujjv\\Desktop\\Testing\\HandleAuthenticationusing AutoIT\\AuthenticationWindow.exe");
		    driver.get("https://www.engprod-charter.net/");
		    System.out.println("Test Passed");
		}

}
