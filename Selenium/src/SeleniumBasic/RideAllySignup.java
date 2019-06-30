package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RideAllySignup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumaujjv\\Downloads\\TST\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new  ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(700,TimeUnit.MILLISECONDS);
	    driver.get("https://rideally.com/");
	    Thread.sleep(3000);
	    //1 Verify SignUp button displayed when click on login from homepage
	    driver.findElement(By.xpath("//A[@class='loginbtn'][text()='LOGIN']")).click();
	    Thread.sleep(1500);
	    //2 Verify SignUp button clickable
	    driver.findElement(By.xpath("//BUTTON[@id='signupe']")).click();
	    Thread.sleep(1000);
	    //3 Verify the text displayed on signup page
	       WebElement s=driver.findElement(By.xpath("//P[@class='graycolor'][text()='Sign Up With Your Email']"));
	  			String title=s.getText();
	  			//Thread.sleep(700);
	  			if(title.equals("Sign Up With Your Email")){
	  				System.out.println("Verified the text displayed on signup page");
	  			}
	  			else{
	  				System.out.println("test case failed");
	  			}
	
	    	// 4 Able to clock on Sign back Button
	    driver.findElement(By.id("signupback1")).click();
	    Thread.sleep(1000);
	    driver.close();
	    
}
}