package datadrivenactitime;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameworkdatadriveninvalid {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-bnt3rno/login.do");
		 read flib = new read();
		String username = flib.test("./data/TestDataAct.xlsx","valid",1,0);
		String password = flib.test("./data/TestDataAct.xlsx","valid",1,1);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
      driver.findElement(By.id("loginButton")).click();

	}

}
