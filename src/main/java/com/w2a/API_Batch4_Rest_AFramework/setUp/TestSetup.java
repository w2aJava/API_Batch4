package com.w2a.API_Batch4_Rest_AFramework.setUp;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.restassured.RestAssured;

public class TestSetup {
	
	@BeforeSuite
	public void setUp()
	{
		

		RestAssured.baseURI="https://api.stripe.com";
		RestAssured.basePath="/v1";
	}
	
	@BeforeTest
	public void beforeTest()
	{
		
	}
	
	@BeforeClass
	public void beforeClass()
	{
		
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		
	}
	
	@AfterMethod
	public void afterMethod()
	{
		
	}
	
	@AfterClass
	public void AfterClass()
	{
		
	}
	
	@AfterTest
	public void afterTest()
	{
		
	}
	
	@AfterSuite
	public void tearDown()
	{
		
	}
	
	
	

}
