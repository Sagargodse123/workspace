package task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actilogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-bnt3rno/login.do"); 
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
      driver.findElement(By.id("loginButton")).click();
      
           WebElement gettitle= driver.findElement(By.xpath("//title[.='actiTIME - Enter Time-Track']"));
           String title = driver.getTitle();

           
           
           
           if( title.equals(gettitle))
           {
        	   System.out.println("test case passed");
           }
           else
           {
        	   System.out.println("test case failed");
           }
                                                  
     
     
	}

}
