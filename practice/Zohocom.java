package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zohocom {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.zoho.com/crm/signup.html");
          driver.findElement(By.id("namefield")).sendKeys("Sagar Godse");
          driver.findElement(By.id("email")).sendKeys("sagargodse303@gmail.com");
          driver.findElement(By.name("password")).sendKeys("Sagar@1234");
          driver.findElement(By.id("mobile")).sendKeys("9130179632");
          Thread.sleep(5000);
          driver.findElement(By.xpath("//span[@class='unchecked']")).click();
          driver.findElement(By.id("signupbtn")).click();
          
	}

}
