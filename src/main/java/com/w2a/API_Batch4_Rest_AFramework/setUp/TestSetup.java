package com.w2a.API_Batch4_Rest_AFramework.setUp;

import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.w2a.API_Batch4_Rest_AFramework.util.ConfigProperties;
import com.w2a.API_Batch4_Rest_AFramework.util.ExcelReader;

import io.restassured.RestAssured;

public class TestSetup {

	public static ConfigProperties configProperties;

	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "\\src\\test\resources\\testData\\TestData.xlsx");

	@BeforeSuite
	public void setUp() {
		configProperties = ConfigFactory.create(ConfigProperties.class);

		RestAssured.baseURI = configProperties.getBaseURI();
		RestAssured.basePath = configProperties.getBasePath();
	}

	@BeforeTest
	public void beforeTest() {

	}

	@BeforeClass
	public void beforeClass() {

	}

	@BeforeMethod
	public void beforeMethod() {

	}

	@AfterMethod
	public void afterMethod() {

	}

	@AfterClass
	public void AfterClass() {

	}

	@AfterTest
	public void afterTest() {

	}

	@AfterSuite
	public void tearDown() {

	}

}
