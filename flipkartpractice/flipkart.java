package flipkartpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com");
	
		driver.findElement(By.xpath("//button[.='✕']")).click();
	
		driver.findElement(By.name("q")).sendKeys("laptop");
	
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	
		driver.findElement(By.xpath("(//div[@class='_213eRC _2ssEMF'])[8]")).click();
		driver.findElement(By.xpath("(//div[@class='_1Y4Vhm _4FO7b6'])[6]")).click();
	      driver.findElement(By.xpath("(//div[@class='_1xHGtK _373qXS']/descendant::div[@class='_312yBx SFzpgZ'])[1]")).click();
	    	      
		
		

	}

}
