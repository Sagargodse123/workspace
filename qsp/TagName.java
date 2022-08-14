package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class TagName {



	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		   WebDriver drivers=new ChromeDriver();
		   drivers.manage().window().maximize();
		   drivers. get("http://www.google.com");
		   drivers.findElement(By.id("input")).sendKeys("java");
		 
		   
		  
		  

	}
 }