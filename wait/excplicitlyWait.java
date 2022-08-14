package wait;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class excplicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
	
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("momos");
		Thread.sleep(4000);
		List<WebElement> op= driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
                 
                  
		    
		

		for(WebElement s1:op)
		{
			String p1 = s1.getText();
			System.out.println(p1);

		}
	}


		
	}


