package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateRadioCheckbox {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumaujjv\\Downloads\\TST\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		 
        driver.get("http://www.facebook.com");
        Thread.sleep(3000);

       WebElement male_radio_button=driver.findElement(By.xpath("//INPUT[@value='2']"));

       boolean status=male_radio_button.isDisplayed();

       System.out.println("Male radio button is Displayed >>"+status);

        boolean enabled_status=male_radio_button.isEnabled();

        System.out.println("Male radio button is Enabled >>"+enabled_status);

      boolean selected_status=male_radio_button.isSelected();

        System.out.println("Male radio button is Selected >>"+selected_status);

        male_radio_button.click();

      boolean selected_status_new=male_radio_button.isSelected();

        System.out.println("Male radio button is Selected >>"+selected_status_new);
        
		}
}

