package SeleniumBasic;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsforloop {
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumaujjv\\Downloads\\TST\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/?stype=lo&jlou=AfeNFMm4i3HKwea16INUny4XV46QVaw2WPgu_1gs-Hw63R-KhTmHOjRLh8WWbwut8u0zsii-dN-vGhsqDps4cpf0Z9Lt-yCj-n1nD2K4tyIW5w&smuh=324&lh=Ac-F4goBIFJ0UceY");
		driver.manage().window().maximize();
		List<WebElement> linklist=driver.findElements(By.tagName("a"));
		int n=linklist.size();
		System.out.println(n);
			for(int i=0;i<linklist.size();i++){
			String listname=linklist.get(i).getText();
			System.out.println(listname);
			
		}
		
		
		
	}

}
