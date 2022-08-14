package OperationalMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllselectedOption{

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("file:///C:/Users/Lenovo/Desktop/.HTML/multiselect%20dropdown.html");
		WebElement ms = driver.findElement(By.id("menu"));
		               Select YES = new  Select(ms);
		               
		               for(int i=0;i<=5;i++)
		               {
		            	  YES.selectByIndex(i);
		            	   
		               }
		              
		              
		            
		            	  List<WebElement> op = YES.getAllSelectedOptions();
		            	  for(WebElement all:op)
		            	  {
		            		 String options = all.getText();
		            		 System.out.println(options);
		            	  }
		            	              
		          
		               
		               
		       
		

	}

}
