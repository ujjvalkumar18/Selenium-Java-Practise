package SeleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumaujjv\\Downloads\\TST\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		List<WebElement> Totalframe=driver.findElements(By.tagName("iframe"));
		System.out.println("Total No of frames"+ Totalframe.size());
		for(WebElement i: Totalframe){
			driver.switchTo().frame(i);
			System.out.println(driver.findElement(By.xpath("/html/body/div[7]/div[8]/div/div/div[1]/iframe")).getText());
			driver.close();
			}
		
		
	}

}
