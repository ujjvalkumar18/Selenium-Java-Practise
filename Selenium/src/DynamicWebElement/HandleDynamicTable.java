package DynamicWebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumaujjv\\Downloads\\TST\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new  ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.w3schools.com/html/html_tables.asp");
	  //*[@id="customers"]/tbody/tr[2]/td[1]
	  //*[@id="customers"]/tbody/tr[3]/td[1]
	  //*[@id="customers"]/tbody/tr[4]/td[1]
	    List<WebElement> row=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
	    int rowcount=row.size();
	    System.out.println("No of rows "+rowcount);
	    
		String beforeXpath = "//*[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[1]";
		for(int i=2;i<=rowcount;i++){
			String actualxpath=beforeXpath+i+afterXpath;
			WebElement element=driver.findElement(By.xpath(actualxpath));
			System.out.println(element.getText());
		}		
    System.out.println("***************************");
  //*[@id="customers"]/tbody/tr[2]/td[2]
  	String xpathcontact="]/td[2]";
  	for(int i=2;i<=rowcount;i++){
  		String actualxpathcontact=beforeXpath+i+xpathcontact;
  		WebElement elementcontact=driver.findElement(By.xpath(actualxpathcontact));
  		System.out.println(elementcontact.getText());
  	}
  	System.out.println("***************************");
  	 //*[@id="customers"]/tbody/tr[2]/td[3]
  	String xpathcountry="]/td[3]";
  	for(int i=2;i<=rowcount;i++){
  		String actualxpathcontact=beforeXpath+i+xpathcontact;
  		WebElement elementcountry=driver.findElement(By.xpath(actualxpathcontact));
  		System.out.println(elementcountry.getText());
}
  	
  	System.out.println("*********************");

  //*[@id="customers"]/tbody/tr[1]/th[1]
  	String colbeforexpath="//*[@id='customers']/tbody/tr[1]/th[";
    String colafterxpath="]";
  List<WebElement> col=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th"));
  int colcount=col.size();
  System.out.println("No of columns "+colcount);
  System.out.println("Names of Columns are ");
  for(int i=1;i<=colcount;i++){
  String colxpath= colbeforexpath+i+colafterxpath;
  WebElement elementcol=driver.findElement(By.xpath(colxpath));
  String colText=elementcol.getText();
  System.out.println(colText);
  
  }

	}
}
    
