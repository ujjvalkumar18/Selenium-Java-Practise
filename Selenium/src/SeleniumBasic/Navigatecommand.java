package SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatecommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumaujjv\\Downloads\\TST\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		//Back and forward buttons Simulations 
		driver.navigate().to("https://www.myntra.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
