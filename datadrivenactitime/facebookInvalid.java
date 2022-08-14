package datadrivenactitime;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookInvalid {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		
		 read flib = new read();
			int fc = flib.test1("./data/TestDataAct.xlsx","invalid");
			
		    for(int i=1;i<=fc;i++)
		    {
		    	
			String username = flib.test("./data/Facebook.xlsx","invalid",i,0);
			String password = flib.test("./data/Facebook.xlsx","invalid",i,1);
			System.out.println(i);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("email")).clear();
		    }

	}

}
