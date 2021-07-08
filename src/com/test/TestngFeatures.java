package com.test;

import org.testng.annotations.Test;

public class TestngFeatures {

	//To Create a dependency on the feature, that means homepage test case is depend on the login module)
	
	
	@Test
	public void loginTest() {
		System.out.println("Login test");
		//int i=9/0;
	}
	
	//use dependsOnMethods feature
	
	@Test(dependsOnMethods= "loginTest")
	public void HomePageTest() {
		System.out.println("home page test");
	}
	
	
	
	
}
