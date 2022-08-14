package dropdownMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class seleectMethod {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("file:///C:/Users/Lenovo/Desktop/.HTML/multiselect%20dropdown.html");
		WebElement ms = driver.findElement(By.id("menu"));
		 Select sel = new Select(ms);
		
		for(int i=0;i<=5;i++)
		{
			    sel.selectByIndex(i);
			    Thread.sleep(1000);
			
		}
		List<WebElement> v1 = sel.getAllSelectedOptions();
		
		 for(WebElement p1:v1)
		 {
			 String g1 = p1.getText();
			 Thread.sleep(1000);
			 System.out.println(g1);
		 }
		
		 

	}

}
