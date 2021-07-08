package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {
	
	
	@Test (expectedExceptions = NumberFormatException.class)
	public void test1(){
		String x = "100A";
		Integer.parseInt(x);
		
		
	}
}
