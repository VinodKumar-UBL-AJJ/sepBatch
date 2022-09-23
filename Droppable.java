package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");

		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		
		WebElement drag= driver.findElement(By.id("draggable"));
		WebElement drop= driver.findElement(By.id("droppable"));
		
		Actions action= new Actions(driver);  // Syntax to create an object: ClassName variableName= new ClassName
		
		//action.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
		
		action.dragAndDrop(drag, drop).build().perform();

	}

}
