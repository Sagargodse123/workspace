package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zohosignin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.zoho.com/crm/signup.html");
		 driver.findElement(By.xpath("//a[@class='login']")).click();
          driver.findElement(By.id("login_id")).sendKeys("sagargodse303@gmail.com");
       
          driver.findElement(By.id("nextbtn")).click();
          
          driver.findElement(By.id("password")).sendKeys("Sagar@1234");
          driver.findElement(By.id("nextbtn")).click();
          
 
          driver.findElement(By.id("orgName")).sendKeys("jacobian");
          driver.findElement(By.xpath("//input[@class='primarybtn crm-font-regular']")).click();
          driver.findElement(By.xpath("(//div[@class=' lyteItem'])[2]")).click();
          
          
	}

}
