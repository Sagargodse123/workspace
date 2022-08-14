package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class implicitlywait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/s?k=by+amzon&adgrpid=67426081828&ext_vrnc=hi&gclid=Cj0KCQjw8uOWBhDXARIsAOxKJ2FUafVa6wNkYY952hOauceuhCiVUhvOP-x__dpzaxP3fBhMHaq8_-8aAnlQEALw_wcB&hvadid=294136395331&hvdev=c&hvlocphy=1007788&hvnetw=g&hvqmt=b&hvrand=15475305543138804566&hvtargid=kwd-439090989740&hydadcr=15412_1746882&tag=googinhydr1-21&ref=pd_sl_27qjqmnzhv_b");
		
		WebElement d1 = driver.findElement(By.id("twotabsearchtextbox"));
		d1.clear();
		d1.sendKeys("laptop");
	
		driver.findElement(By.id("nav-search-submit-button")).click();
	
		driver.findElement(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::span[@class='a-price-whole'])[1]")).click();

	}

}
