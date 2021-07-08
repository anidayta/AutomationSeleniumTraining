package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngBasics {

	//Pre-Conditions - annotions - starting with @Before
	
	@BeforeSuite
	public void setup() {
	System.out.println("setup system property for chrome");
	
	}

	@BeforeTest
	public void launchBrowser() {
		System.out.println("launch chrome Browser");
	
	}
	
	@BeforeClass
	public void login() {
		System.out.println("lgin method");
	
	
	}
		@BeforeMethod
		public void enterURL(){
			System.out.println("enter URL");
			
	}	
		

	
	//Test Cases- starting with @Test
		
		@Test //TestCase 1
		public void googleTitleTest() {
			System.out.println("Google Title Test");
	}
		
		@Test //TestCase 2
		public void searchTest() {
			System.out.println("search test");
		}
		
		//Post Condition- starts with @After 
		@AfterMethod
		public void logout() {
			System.out.println("logut from app");
			
			
	}
		
		@AfterTest
		public void deleteAllCookies() {
			System.out.println("deleteAllCookies");
	}
		@AfterClass
		public void closeBrowser() {
			System.out.println("close Browser");
	}
		
		@AfterSuite
		public void generateTestReport() {
		System.out.println("generate Test Report");	
		
	}
		
}
