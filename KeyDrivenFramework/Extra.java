package KeyDrivenFramework;

import org.openqa.selenium.By;

public class Extra  extends BaseTest {
	
	
	public void test(String a1,String a2) {
		driver.findElement(By.name("username")).sendKeys(a1);
		driver.findElement(By.name("pwd")).sendKeys(a2);
		
		driver.findElement(By.id("loginButton")).click();
		
	}

}
