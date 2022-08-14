package scrollUsingjavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollBy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.selenium.dev/");
		 WebElement text = driver.findElement(By.xpath("(//a[.='@titusfortner'])[1]"));
		 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Point h1 = text.getLocation();
		      int d1 = h1.getX();
		     int d2 = h1.getY();
		     
		     Thread.sleep(4000);
		     js.executeScript("window.scrollBy("+d1+","+d2+")");
		     
		     
	
	    
	    

	}	

}
