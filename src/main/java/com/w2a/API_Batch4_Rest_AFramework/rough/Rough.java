package com.w2a.API_Batch4_Rest_AFramework.rough;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rough {

	@BeforeSuite
	public void beforeSuite() {

		System.out.println("Before Suite Executed");
	}

	@BeforeTest
	public void beforeTest() {
		
		System.out.println("Before Test Executed");

	}

	@BeforeClass
	public void beforeclass() {

		System.out.println("Before Class Executed");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method Executed");

	}

	@Test
	public void testCase1() {
		System.out.println("Executing testcase 1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("Executing testcase 2");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method  Executed");

	}

	@AfterClass
	public void afterclass() {

		System.out.println("After class  Executed");
	}

	@AfterTest
	public void afterTest() {

		System.out.println("After test  Executed");		
	}

	@AfterSuite
	public void afterSuite() {

		System.out.println("After Syite  Executed");
	}

}
