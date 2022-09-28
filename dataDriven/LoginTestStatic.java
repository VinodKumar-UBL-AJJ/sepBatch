package dataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTestStatic {

	
	String[][] data= {
			
			{"Admin","admin123"},
			{"abcde","qwert"},
			{"qwert","admin123"},
			{"Admin","qwert"},

	};
	
	
	@DataProvider(name="loginData")
	public String[][] loginTestData() {
		
		return data;
	}
	
	
	
	
	
	@Test(dataProvider = "loginData")
	public void loginTestCase(String uname, String pword) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pword);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}
	
}
