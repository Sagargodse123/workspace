package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class bluestone {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeOptions g1 = new ChromeOptions();
	     g1.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(g1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.BlueStone.com");
		driver.findElement(By.id("confirmBtn")).click();
	
	
		Thread.sleep(10000);
	    WebElement text = driver.findElement(By.id("widget-global-91tzxld7b4l"));
         driver.switchTo().frame(text);
         Thread.sleep(4000);
     	
 		driver.findElement(By.xpath("//div[@class='lc-1x7wur2 e1dmt1bi0']")).click();
		
        driver.findElement(By.id("name")).sendKeys("sagar");
        driver.findElement(By.id("email")).sendKeys("sagargodse303@gmail.com");
        driver.findElement(By.id("fzqatze792t_146917605549304831")).sendKeys("9130179632");
        driver.findElement(By.xpath("//span[.='Start the chat']")).click();
	}

}
