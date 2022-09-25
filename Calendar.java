package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {



		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();

		driver.get("https://jqueryui.com/datepicker/");

		driver.manage().window().maximize();

		driver.switchTo().frame(0);

		WebElement datepicker= driver.findElement(By.id("datepicker"));
		//datepicker.sendKeys("11/10/2022"); First Simple Approach	
		datepicker.click();

		WebElement monthYear= driver.findElement(By.className("ui-datepicker-title"));
		String monthYearValue = monthYear.getText();   // Getting the month and year title

		String month = monthYearValue.split(" ")[0].trim(); // splitting month from it
		String year= monthYearValue.split(" ")[1].trim(); //splitting year from it



		while (!(month.equals("August")&&year.equals("2025"))) {

			driver.findElement(By.xpath("//a[@title='Next']")).click();

			monthYear= driver.findElement(By.className("ui-datepicker-title"));
			monthYearValue = monthYear.getText();
			month = monthYearValue.split(" ")[0].trim();
			year= monthYearValue.split(" ")[1].trim();

		}



		driver.findElement(By.xpath("//a[text()='29']")).click();









	}

}
