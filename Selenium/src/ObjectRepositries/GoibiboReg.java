package ObjectRepositries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoibiboReg {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties p=new Properties();
		FileInputStream fs=new FileInputStream("C:\\Resume\\Selenium\\src\\ObjectRepositries\\goibibo.properties");
		p.load(fs);
		System.out.println(p.getProperty("mobno"));
		System.out.println(p.getProperty("pass"));
		String url=p.getProperty("URL");
		String browsername = p.getProperty("browser");
		System.out.println(browsername);
		if(browsername.equals("chrome")){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumaujjv\\Downloads\\TST\\chromedriver_win32\\chromedriver.exe");
	    driver=new  ChromeDriver();
	    driver.manage().window().maximize();
		}
	driver.get(url);
	driver.findElement(By.xpath(p.getProperty("mobnoxpath"))).sendKeys(p.getProperty("mobno"));
	driver.findElement(By.xpath(p.getProperty("passxpath"))).sendKeys(p.getProperty("pass"));
	driver.findElement(By.xpath(p.getProperty("emailxpath"))).sendKeys(p.getProperty("email"));
	driver.findElement(By.xpath(p.getProperty("sign_up_btn"))).click();
	
	
	}
}
