package testCases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class LoginTestCase extends ProjectSpecificMethods{

	
	@Test(dataProvider = "loginData")
	public void runLoginTestCase(String uname, String pword) {
		
		
		new LoginPage(driver).enterUsername(uname).enterPassword(pword).clickLoginButton();
		
	}
}
