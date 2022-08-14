
		package TryAndCatchBlock;

		import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

		import org.openqa.selenium.chrome.ChromeDriver;

		public class TryAndCatchBlock {

			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
	
				driver.get("http://desktop-bnt3rno/login.do"); 
				driver.findElement(By.name("username")).sendKeys("admin");
				driver.findElement(By.name("pwd")).sendKeys("manager");
		      driver.findElement(By.id("loginButton")).click();
		      try 
		      {
		          driver.findElement(By.id("loginButton")).click();
		      }
		      catch (NoSuchElementException e)
		      {
		    	  
				System.out.println(e);
			}
			}

	}


