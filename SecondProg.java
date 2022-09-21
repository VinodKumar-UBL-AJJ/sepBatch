package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondProg {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();

		driver.get("http://tutorialsninja.com/demo/");
		
		driver.manage().window().maximize();
		
		WebElement searchBox= driver.findElement(By.name("search"));
		searchBox.sendKeys("MacBook"+Keys.ENTER);
		
		WebElement option1= driver.findElement(By.linkText("MacBook"));
		option1.click();
		
		String title = driver.getTitle();
		System.out.println("title of a page is :"+title);
		
		

	}

}
