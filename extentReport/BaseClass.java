package extentReport;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass {

	ChromeDriver driver;
	
	static ExtentHtmlReporter reporter;
	static ExtentReports extent;
	static ExtentTest test;
	
	@BeforeMethod
	public void loadURL() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	

		@BeforeSuite
		public void startReport() {
			
			reporter= new ExtentHtmlReporter("./ExtentReport/report.html"); // Generate raw HTML file
			extent = new ExtentReports();  // Provide a structure to the HTML
			extent.attachReporter(reporter);   
					
		}
		
		
		
		
		@BeforeClass
		public void testDetails() {
			
			test= extent.createTest("Login test Case", "positive test for login functionality");
			test.assignAuthor("Vinod");
			test.assignCategory("Functional");
			
		}
		
		@AfterMethod
		public void closeBrowser() {
			driver.close();
		}

		@AfterSuite
		public void closeReport() {
			extent.flush();
		}



}