package AssignmentRemoveDuplicate;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RDByTreeset {


	public static  void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Lenovo/Desktop/.HTML/multiselect%20dropdown.html");
		WebElement ms = driver.findElement(By.id("menu"));
		Select YES = new  Select(ms);
		List<WebElement> target = YES.getOptions();
		TreeSet<String> get = new TreeSet<String>();
		for(int i=0;i<target.size();i++)
		{
			String text = target.get(i).getText();
			get.add(text);

		}

		for(String U:get) 
		{
			System.out.println(U);

		}


	}

}
