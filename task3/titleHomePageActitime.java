package task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class titleHomePageActitime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-bnt3rno/login.do"); 
		WebElement s1 = driver.findElement(By.xpath("//title[.='actiTIME - Login']"));
	               String sam = driver.getTitle();
	     
	         System.out.println(sam);

		if(sam.equals(s1))
	     {
			System.out.println("the gettile method is work now it ,test case is  passed");
	    	 
	     }
		else {
			System.out.println("the gettile method is not work now it ,test case is  failed");
			
		}
		
           
           		
      
     
	}

}
