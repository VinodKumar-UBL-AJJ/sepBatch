package seleniumBasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.findElement(By.linkText("OrangeHRM, Inc")).click();


		String parentWindow = driver.getWindowHandle();  //use to store parent window

		Set<String> Handles = driver.getWindowHandles(); //use to store all windows

		for (String newWindow : Handles) {

			driver.switchTo().window(newWindow);

		}


		String title = driver.getTitle();
		System.out.println(title);


		driver.switchTo().window(parentWindow);


		String title2 = driver.getTitle();
		System.out.println(title2);

	}

}
