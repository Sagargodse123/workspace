package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.zomato.com/");
		 driver.findElement(By.xpath("//a[.='Sign up']")).click();
		 driver.findElement(By.xpath("(//input[@class='sc-1yzxt5f-9 bbrwhB'])[2]")).sendKeys("sagar godse");
		 driver.findElement(By.xpath("(//input[@class='sc-1yzxt5f-9 bbrwhB'])[2]")).sendKeys("sagargodse862@gmail.com");
		 driver.findElement(By.xpath("//input[@class='sc-1o2pknd-1 iPRmnw']")).click();
		 driver.findElement(By.xpath("//button[@class='sc-1kx5g6g-1 elxuhW']")).click();

	}

}
