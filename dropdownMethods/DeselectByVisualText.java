package dropdownMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByVisualText {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("file:///C:/Users/Lenovo/Desktop/.HTML/multiselect%20dropdown.html");
		WebElement ms = driver.findElement(By.id("menu"));
		               Select YES = new  Select(ms);
		               YES.selectByVisibleText("shira");
		               Thread.sleep(1000);
		               YES.deselectByVisibleText("shira");
		       
		

	}

}
