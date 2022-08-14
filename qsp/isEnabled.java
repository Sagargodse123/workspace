package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {

	public static void main(String[] args) throws InterruptedException {
	     
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com");
		 driver.findElement(By.id("email")).sendKeys("8625853882");
		 driver.findElement(By.id("pass")).sendKeys("9130179632");
		WebElement div = driver.findElement(By.name("login"));
		Thread.sleep(4000);
		boolean p1 = div.isEnabled();
		 System.out.println(p1);
	}

}
