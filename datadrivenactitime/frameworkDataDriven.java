package datadrivenactitime;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameworkDataDriven{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-bnt3rno/login.do");
		 read flib = new read();
		int fc = flib.test1("./data/TestDataAct.xlsx","invalid");
		
		    for(int i=1;i<=fc;i++)
		    {
		String username = flib.test("./data/TestDataAct.xlsx","invalid",i,0);
		String password = flib.test("./data/TestDataAct.xlsx","invalid",i,1);
		System.out.println(i);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
        driver.findElement(By.id("loginButton")).click();
        Thread.sleep(4000);
    	driver.findElement(By.name("username")).clear();
    	
		    }

	}

}
