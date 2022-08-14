package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) throws InterruptedException {
	     
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("file:///C:/Users/Lenovo/Desktop/.HTML/checkbox.html");
		WebElement div = driver.findElement(By.id("automation"));
		Thread.sleep(4000);
		div.click();
		Thread.sleep(4000);
		boolean p1 = div.isSelected();
		System.out.println(p1);
		 

	}

}
