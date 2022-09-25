package testNG;

import org.testng.annotations.Test;

public class DependencyManagement {

	@Test
	public void highSchool() {
		
		System.out.println("School days");
	}
	
	@Test(dependsOnMethods = "highSchool")
	public void HigherSecondary() {
		
		System.out.println("Pre university days");
	}
	
	@Test(dependsOnMethods = "HigherSecondary")
	public void Engineering() {
		
		System.out.println("College days");
	}
	
	
	
}
