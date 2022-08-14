package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hotstar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.hotstar.com/in");
		 driver.findElement(By.id("btn-hamburger")).click();
		 driver.findElement(By.xpath("(//div[.='Languages'])[2]")).click();
		 driver.findElement(By.xpath("(//div[@class='meta-center-desc'])[8]")).click();
		 driver.findElement(By.xpath("(//div[@class='details'])[1]")).click();
		 driver.findElement(By.xpath("//a[@class='cover-link']")).click();
		 

	}

}
