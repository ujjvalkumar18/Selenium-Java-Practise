package NoOfLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumaujjv\\Downloads\\TST\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new  ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com/");
	    List<WebElement> LinksList=driver.findElements(By.tagName("a"));
	    int LinksCount=LinksList.size();
	    System.out.println("Total no Links "+LinksCount);
	    for(int i=1;i<=LinksList.size();i++){
	    	String LinkName=LinksList.get(i).getText();
	    	System.out.println(LinkName);
	    }
	    
	}

}
