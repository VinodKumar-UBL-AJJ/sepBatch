package testNG;

import org.testng.annotations.Test;

public class Drive_A_Car {
	
	@Test(priority = 0)
	public void switchOnEngine() {
		
		System.out.println("Start the engine");
	}
	
	@Test(priority = 1)
	public void applyFirstGear() {
		
		System.out.println("Put a first gear");
		
	}

	@Test(priority = 3)
	public void applySecondGear() {
		
		System.out.println("Put a second gear");
		
	}
	@Test(priority = 4)
	public void applyThirdGear() {
		
		System.out.println("Put a Third gear");
		
	}
	
	@Test(priority = 5)
	public void applyFourthGear() {
		
		System.out.println("Put a Fourth gear");
		
	}
	
	
	public void switchOnMusic() {
		
		System.out.println("Switch on music");
		
	}
	
	
}



