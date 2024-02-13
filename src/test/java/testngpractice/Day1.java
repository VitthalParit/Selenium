package testngpractice;

import org.testng.annotations.Test;

public class Day1 {
	
	@Test(groups = {"smoke"})
	public void login() {
		System.out.println("login test cases");
		
	}
	
	@Test
	public void mouse() {
		System.out.println("mouse test cases");
		
	}
	
	@Test(groups = {"re"})
	public void scroll() {
		System.out.println("scroll test cases");
		
	}
	
	
	@Test
	public void dropdown() {
		System.out.println("dropdown loan test cases");
		
	}
	
	@Test (groups = {"re"})
	public void suite() {
		System.out.println("suite test cases");
		
	}
	
	

}
