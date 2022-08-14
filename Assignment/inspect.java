package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class inspect {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com");
		WebElement j1 = driver.findElement(By.xpath("(//div[@class='gb_e gb_f'])[1]"));
		Actions d1 = new Actions(driver);
		d1.contextClick(j1).perform();
		Robot robo = new Robot();
		
		
		for(int i=0;i<=5;i++)
		{
			robo.keyPress(KeyEvent.VK_DOWN);
			robo.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
		}
	
		robo.keyPress(KeyEvent.VK_ENTER);
		
	}

}
