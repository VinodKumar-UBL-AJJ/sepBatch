package testNG;

import org.testng.annotations.Test;

public class GroupingConcept {
	
	@Test(groups = "mobile")
	public void vivo() {
		
		System.out.println("Mobile phone VIVO");
	}
	
	@Test(groups = "mobile")
	public void iphone() {
		
		System.out.println("Mobile phone APPLE");
	}
	
	@Test(groups = "mobile")
	public void oppo() {
		
		System.out.println("Mobile phone OPPO");
	}
	
	@Test(groups = "laptop")
	public void lenovo() {
		
		System.out.println("Laptop Lenovo");
	}

	@Test(groups = "laptop")
	public void hp() {
		
		System.out.println("Laptop HP");
	}
	
	@Test(groups = "laptop")
	public void dell() {
		
		System.out.println("Laptop Dell");
	}
	
	
	
	
}
