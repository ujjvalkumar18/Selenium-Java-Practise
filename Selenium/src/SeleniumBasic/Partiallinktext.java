package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partiallinktext {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumaujjv\\Downloads\\TST\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/link.html");
		driver.findElement(By.partialLinkText("click here")).click();
		System.out.println("Title of page" + driver.getTitle());
		
		driver.close();
		// TODO Auto-generated method stub

	}

}
