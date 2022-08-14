package Assignment;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;


public class seleniumdev {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.javatpoint.com/");
		WebElement text = driver.findElement(By.xpath("(//h2[@class='h3'])[1]"));
		Actions tar = new Actions(driver);
	      Thread.sleep(4000);
	      for(int i=0;i<5;i++) {
			tar.clickAndHold(text).perform();
	      }
		
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_C);
		robo.keyRelease(KeyEvent.VK_C);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		 
		
		driver.navigate().to("https://www.google.com");
	    WebElement var = driver.findElement(By.name("q"));
	    var.click();
	  

	    robo.keyPress(KeyEvent.VK_CONTROL);
	    robo.keyPress(KeyEvent.VK_V);
	    robo.keyRelease(KeyEvent.VK_V);
	    robo.keyRelease(KeyEvent.VK_CONTROL);
	    driver.findElement(By.name("btnK")).click();
	     
	     
	    RemoteWebDriver hard = (RemoteWebDriver)driver;
	    File screen = hard.getScreenshotAs(OutputType.FILE);
	           File screen2 = new File("C:\\Users\\Lenovo\\Desktop\\sh\\sh3.png");
	           Files.copy( screen ,  screen2);
	     
				

	}

}
