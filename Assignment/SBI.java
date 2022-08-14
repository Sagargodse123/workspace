package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;


public class SBI {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com");
		   RemoteWebDriver hard = (RemoteWebDriver)driver;
		    File screen = hard.getScreenshotAs(OutputType.FILE);
		           File screen2 = new File("C:\\Users\\Lenovo\\Desktop\\sh\\sh3.png");
		           Files.copy( screen ,  screen2);

	}

}
