package extentReport;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;

public class ExtentClass extends BaseClass{
	
	
	
	@Test
	public void LoginTestCase() throws IOException {
		
		/*
		 * try { driver.findElementById("txtUsername").sendKeys("Admin");
		 * reportStep("Username is entered successfully", "pass"); } catch (Exception e)
		 * { reportStep("username not entered successfully", "fail");
		 * e.printStackTrace(); }
		 */
		
		
		try {
			driver.findElementByXPath("//input[@name='username']").sendKeys("Admin");
			reportStep("username entered successfully", "pass");
		} catch (Exception e1) {
			reportStep("username not entered successfully", "fail");
			e1.printStackTrace();
		}
		
		
		
		
		try {
			driver.findElementByXPath("//input[@name='password']").sendKeys("admin123");
			reportStep("Password entered successfully", "pass");
		} catch (Exception e) {
			reportStep("Password not entered successfully", "fail");
			e.printStackTrace();
		}
		
		
		
		
		try {
			driver.findElementByXPath("//button[@type='submit']").click();
			reportStep("Login button got clicked", "pass");
		} catch (Exception e) {
			reportStep("Login button not clicked", "fail");
			e.printStackTrace();
		}
	}
	
	
	
	
	public void reportStep(String msg, String status) throws IOException {
		
		
	/*
	 * if(status.equals("pass")) {
	 * test.pass(msg,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"
	 * +takesnap()+".png").build()); }
	 * 
	 * else {
	 * test.fail(msg,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"
	 * +takesnap()+".png").build()); } }
	 */
	
			if(status.equals("pass")) {
			
			test.pass(msg, MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/"+takesnap()+".png").build());
		}
		
		else {
			
			test.fail(msg, MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/"+takesnap()+".png").build());
		}
	
	}
	
	
	
	/*
	 * public long takesnap() throws IOException {
	 * 
	 * 
	 * 
	 * long number=(long)(Math.floor(Math.random()*90000L)+10000L);
	 * 
	 * File src = driver.getScreenshotAs(OutputType.FILE);
	 * 
	 * File dest= new File("./snaps/img"+number+".png"); FileUtils.copyFile(src,
	 * dest);
	 * 
	 * return number;
	 * 
	 * }
	 */
	
	
	
	
	public long takesnap() throws IOException {
		
		
	long number	=(long)(Math.floor(Math.random()*90000L)+10000L);
		
	
	File src = driver.getScreenshotAs(OutputType.FILE);
	
	File dest= new File("./snaps/img"+number+".png");
	
	
	FileUtils.copyFile(src, dest);
	
	
	return number;
	
	}

}
