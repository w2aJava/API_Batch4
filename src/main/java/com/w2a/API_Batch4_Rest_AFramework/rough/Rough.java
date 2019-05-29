package com.w2a.API_Batch4_Rest_AFramework.rough;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
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
	public void beforeMethod(Method m) {
		
		
		System.out.println("Before Method Executed");
		System.out.println("TestCase :- "+m.getName()+" execution started");

	}

	@Test(dataProvider="dp")
	public void testCase1(String name,String n) {
		//System.out.println("TestCase :- testCase1 execution started");
		//System.out.println("Executing testcase 1");
	}
	
	@Test(dataProvider="dp")
	public void testCase2(String name,String n) {
		//.out.println("TestCase :- testCase1 execution started");
		//System.out.println("Executing testcase 2");
	}

	@AfterMethod
	public void afterMethod(ITestResult result) {
		
		System.out.println("Execution of TestCase:- "+result.getName()+" finished");
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

	@DataProvider(name="dp")
	public Object[][] getData()
	{
		System.out.println("DataProvider executed");
		
		Object[][] data=new Object[1][2];
		data[0][0]="Rahul";
		data[0][1]="Raman";
		return data;
	}
}
