package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com");
	
		driver.findElement(By.xpath("//button[.='✕']")).click();
	
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	
		Thread.sleep(5000);
	  String src = driver.getWindowHandle();
		Set<String> tar = driver.getWindowHandles();
		for(  String tab:tar) 
		{
			if(!src.equals(tab))
			{
				driver.switchTo().window(tab);
			}
		}
		Thread.sleep(5000);
	driver.findElement(By.xpath("(//div[@class='_2C41yO'])[2]")).click();
	driver.findElement(By.xpath("//a[@class='_1fGeJ5']")).click();
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	Thread.sleep(4000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)", "");
     Thread.sleep(2000);
	driver.findElement(By.xpath("//div[.='Remove']")).click();
	 Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ']")).click();
	
	
	    	      
		
		

	}

}
