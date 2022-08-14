package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindEle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@class='sc-keVrkP cDYFJl']")).sendKeys("biryani");
		Thread.sleep(3000);
		List<WebElement> sagar = driver.findElements(By.xpath("//div[@class='sc-kEmuub sc-bbkauy fSRTaF']"));
		for(int i=0;i<sagar.size();i++)
		{
			WebElement s1= sagar.get(i);
			String p1 = s1.getText();
			Thread.sleep(1000);
			System.out.println(p1);
		}

	}
}

