package seleniumBasics;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocompletion {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();

		driver.get("https://jqueryui.com/autocomplete/");

		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);

		WebElement textBox= driver.findElement(By.id("tags"));

		textBox.sendKeys("a");
		
		Thread.sleep(2000);
		
		//xpath- //elementName[@attribute='value']

		List<WebElement> options= driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));   //import List with java.util
		
		for (WebElement choose : options) {
			
			String text = choose.getText();
			
			if(text.equals("Java")) {
				
				choose.click();
				break;
			}
				
			
		}
		
		

	}

}
