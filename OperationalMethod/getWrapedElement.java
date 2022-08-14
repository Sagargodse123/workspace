package OperationalMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getWrapedElement{

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Lenovo/Desktop/.HTML/multiselect%20dropdown.html");
		WebElement ms = driver.findElement(By.id("menu"));
		Select YES = new  Select(ms);

		WebElement listAllElement = YES.getWrappedElement();
		String option = listAllElement.getText();
		System.out.println(option);




	}

}
