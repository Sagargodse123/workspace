package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeThechildBrowser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.plus2net.com/javascript_tutorial/window-parent.php");
		driver.findElement(By.xpath("(//a[.='Click here to open the child window'])[2]")).click();

		Set<String> wh = driver.getWindowHandles();
		            String wh1 = driver.getWindowHandle();


		for(String window:wh)
		{
			String	title=driver.switchTo().window(window).getTitle();

			if(!title.equals(wh1))
			{
				Thread.sleep(6000);
				driver.switchTo().window(window).close();
			}
		}

	}
}