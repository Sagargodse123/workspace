package KeyDrivenFramework;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CommonMethods extends BaseTest{
	
	
	public void takescreenshot() {
		
		TakesScreenshot sh = (TakesScreenshot)driver;
		 File tsh = sh.getScreenshotAs(OutputType.FILE);
		        File tnsh = new File("");
	}

}
