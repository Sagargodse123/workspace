package KeyDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class TestValidActitime extends BaseTest implements IAutoConstant{
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Flib flib = new Flib();
		
		String username = flib.readPropertFile(PROP_PATH,"username");
		String password = flib.readPropertFile(PROP_PATH,"password");
          Extra ex = new Extra();
          ex.test(username,password );
	
		Thread.sleep(10000);
		bt.closeBrowser();
			
		
		
	}

}