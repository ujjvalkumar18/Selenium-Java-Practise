package SeleniumBasic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadusingRobotClass {

	public static void main(String[] args) throws AWTException {
		Robot robo=new Robot();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumaujjv\\Downloads\\TST\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new  ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demo.automationtesting.in/Register.html");
	    driver.findElement(By.id("imagesrc")).click();;
	    robo.setAutoDelay(2000);//Instead of Thread.sleep();
	  /*Copy to clipBoard
	    StringSelection s =new StringSelection("C:\\Users\\kumaujjv\\Downloads\\TST\\DefectReportTemplate.doc");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(null);
	    robo.setAutoDelay(2000);
        robo.setAutoDelay(1000);//Instead of Thread.sleep();
 
        robo.keyPress(KeyEvent.VK_CONTROL);
        robo.keyPress(KeyEvent.VK_V);
 
        robo.keyRelease(KeyEvent.VK_CONTROL);
        robo.keyRelease(KeyEvent.VK_V);
 
        robo.setAutoDelay(1000);
 
        robo.keyPress(KeyEvent.VK_ENTER);
        robo.keyRelease(KeyEvent.VK_ENTER);*/

	}

}
