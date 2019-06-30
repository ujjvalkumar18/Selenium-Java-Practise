package SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gecko_Driver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kumaujjv\\Downloads\\TST\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//Get the Browser Name or Driver Name
		Class classname=driver.getClass();
		System.out.println(classname.getSimpleName());
		//
		

	}

}
