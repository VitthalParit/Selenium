package testngpractice;

import javax.swing.GroupLayout.Group;

import org.testng.annotations.Test;

public class Day2 {
	
	@Test (groups = {"smoke"})
	public void homeloan() {
		System.out.println("homeloan test cases");
		
	}
	
	@Test
	public void careloan() {
		System.out.println("careloan test cases");
		
	}
	
	@Test (groups = {"re"})
	public void creditcard() {
		System.out.println("creaditcard test cases");
		
	}
	
	
	@Test
	public void Educationlosn() {
		System.out.println("education loan test cases");
		
	}
	
	@Test
	public void EMIloann() {
		System.out.println("EMIloan test cases");
		
	}
	
	

}
