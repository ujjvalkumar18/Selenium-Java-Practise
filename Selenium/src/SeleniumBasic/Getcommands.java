package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumaujjv\\Downloads\\TST\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		/* GET PAGESOURCE
		String getpagesource=null;
		driver.get("https://www.facebook.com/");
		getpagesource=driver.getPageSource();
		System.out.println(getpagesource);*/
		
		/*get Current URL 
		String currenturl = null;
		driver.get("https://www.facebook.com/");
		currenturl=driver.getCurrentUrl();
		System.out.println("Url name " + currenturl);
		String tagName= "";
		driver.findElement(By.id("email")).getTagName();
		System.out.println(tagName);*/
		
		driver.close();
	}

}
