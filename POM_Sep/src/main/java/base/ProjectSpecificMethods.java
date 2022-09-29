package base;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ExcelCode;

public class ProjectSpecificMethods {


	public ChromeDriver driver;

	// opening the browser and loading the URL

	@BeforeMethod
	public void startApp() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		

		driver.manage().window().maximize();
		
		Thread.sleep(3000);

	}



	// closing the browser after completion of test cases

	@AfterMethod
	public void closeApp() {

		driver.close();
	}




	//Sending Data from Excel

	@DataProvider(name="loginData")
	public String[][] sendData() throws IOException {

		return ExcelCode.readExcel();
	}



}
