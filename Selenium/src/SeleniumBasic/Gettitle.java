package SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumaujjv\\Downloads\\TST\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=eCqcWrGSFJXEuAT-66SQBw");
		driver.get("http://demo.automationtesting.in/Register.html");
//		String actualTitle="";
//		String expectedTitle="Google";
//		if (actualTitle.contentEquals(expectedTitle)){
//            System.out.println("Test Passed!");
//        } else {
//            System.out.println("Test Failed");
//
//	}
		driver.close();

}
}

