package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {


	public ChromeDriver driver;


   @BeforeSuite
	public void openChromeBrowser() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();

	}


	@Test
	public void openGoogle() {

		driver.get("https://www.google.co.in/");

	}

	@Test
	public void openBing() {

		driver.get("https://www.bing.com/");

	}

	@Test
	public void openYahoo() {

		driver.get("https://in.search.yahoo.com/");

	}

    @AfterSuite
	public void closeBrowser() {

		driver.quit();
	}


}
