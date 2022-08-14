package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.amazon.com/");
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("poco x3 pro");
		 driver.findElement(By.id("nav-search-submit-button")).click();
		 driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]")).click();
		 driver.findElement(By.id("add-to-cart-button")).click();
		 driver.findElement(By.id("attach-sidesheet-checkout-button")).click();

	}

}