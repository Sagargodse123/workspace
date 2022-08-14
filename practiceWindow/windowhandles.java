package practiceWindow;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.");
		WebElement text = driver.findElement(By.xpath("(//a[.='@titusfortner'])[1]"));
		text.click();
		
		String wh = driver.getWindowHandle();
		String title1 = driver.getTitle();

		Set<String> wh1 = driver.getWindowHandles();
		for(String get:wh1)
		{
			String title = driver.switchTo().window(get).getTitle();
			if(!title.equals(title1))
			{
				driver.switchTo().window(get).close();
			}
		}
	}

}
