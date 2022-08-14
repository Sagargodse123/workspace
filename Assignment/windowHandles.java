package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.monsterindia.com/");
		
	     Thread.sleep(2000);
	     
		driver.findElement(By.id("1")).click();
		
		String handle = driver.getWindowHandle();
         Set<String> handles = driver.getWindowHandles();
         for( String d1:handles)
         {
               
               if(handle.equals(d1)) 
               {
            	   Thread.sleep(6000);
   				driver.switchTo().window(handle).close();
               }
        		
         }

	}

}
