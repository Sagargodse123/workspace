package KeyDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;



public class TestInvalidDataActiTime extends BaseTest  implements IAutoConstant {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();

		Flib flib = new Flib();
		int rc = flib.getRowCount(EXCEL_PATH,"invalid");

		for(int i=1;i<=rc;i++)
		{
			String username = flib.readExcelData(EXCEL_PATH,"invalid",i,0);
			String password = flib.readExcelData(EXCEL_PATH,"invalid",i,1);

			System.out.println(i);
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);

			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(4000);
			driver.findElement(By.name("username")).clear();
		}


		bt.closeBrowser();


	}

}