package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{

	public LoginPage(ChromeDriver driver) {
		
		this.driver=driver;
	}
	
	
	@Test
	public LoginPage enterUsername(String uname) { 
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		
		return this;
	}
	
	@Test
	public LoginPage enterPassword(String pword) {
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pword);
		
		return this;
	}
	
	
	@Test
	public HomePage clickLoginButton() {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		return new HomePage(driver);
	}
	
	
	
}
