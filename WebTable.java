package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();

		driver.get("https://stqatools.com/demo/WebTable.php");

		driver.manage().window().maximize();
		

		 List<WebElement> rows = driver.findElements(By.tagName("tr"));
		 int rowSize = rows.size();
		 System.out.println("No of rows is :"+rowSize);
		 
		 
		 List<WebElement> colums= driver.findElements(By.tagName("th"));
		 int columnSize = colums.size();
		 System.out.println("No of colums is :"+columnSize);
		 
		WebElement email= driver.findElement(By.xpath("//td[normalize-space()='Swapnil']//following::td[2]"));
		String textEmail = email.getText();
		 System.out.println(textEmail);
		 
		 
		 
		
	}

}
