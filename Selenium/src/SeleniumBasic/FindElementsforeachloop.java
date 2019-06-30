package SeleniumBasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsforeachloop {
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumaujjv\\Downloads\\TST\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.get("https://www.google.co.in");
		List<WebElement> link=driver.findElements(By.tagName("a"));
		//String[] linkTexts = new String[linkElements.size()];
		int n=link.size();
		System.out.println(n);
		
		String[] linktext=new String[link.size()];
		int i=0;
		
		for(WebElement e:link){
			linktext[n]=e.getText();
			n++;
			
			System.out.println(linktext[i]);
			break;
		}
		driver.close();
	}
}
