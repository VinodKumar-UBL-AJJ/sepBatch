package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();

		driver.get("http://new.rezofy.com/signupAffliate");

		driver.manage().window().maximize();


		WebElement countries=	driver.findElement(By.id("acountrycombobox"));

		Select select= new Select(countries);  //create an object for Select class
		select.selectByVisibleText("India");







	}

}
