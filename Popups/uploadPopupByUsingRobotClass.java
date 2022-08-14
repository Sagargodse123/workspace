package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadPopupByUsingRobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.ilovepdf.com/pdf_to_word");
		 WebElement d1 = driver.findElement(By.id("pickfiles"));
		 d1.click();
		 
		Robot robo = new Robot();
		
		StringSelection ss = new StringSelection("E:\\ft\\Sagarop.pdf");
		Thread.sleep(4000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_C);
		Thread.sleep(2000);
		robo.keyRelease(KeyEvent.VK_C);
		Thread.sleep(2000);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		robo.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_ENTER);
		
		
		

	}

}
