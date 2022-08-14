package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		Actions drag = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//a[.=' 5000 ']"));
		WebElement target = driver.findElement(By.xpath("(//ol[@class='field13 ui-droppable ui-sortable'])[1]"));
		WebElement src = driver.findElement(By.xpath("//a[.=' BANK ']"));
		WebElement target1 = driver.findElement(By.xpath("(//ol[@class='field13 ui-droppable ui-sortable'])[2]"));

		drag.clickAndHold(source).moveToElement(target).release().build().perform();
		Thread.sleep(4000);
		drag.clickAndHold(src).moveToElement(target1).release().build().perform();




	}

}
