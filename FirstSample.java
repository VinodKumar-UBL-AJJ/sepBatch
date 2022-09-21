package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSample {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();

		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		WebElement searchBox=  driver.findElement(By.name("q"));
		searchBox.sendKeys("APJ"+Keys.ENTER);
		
	}

}
