package com.w2a.API_Batch4_Rest_AFramework.setUp;

import java.lang.reflect.Method;

import org.aeonbits.owner.ConfigFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.w2a.API_Batch4_Rest_AFramework.util.ConfigProperties;
import com.w2a.API_Batch4_Rest_AFramework.util.ExcelReader;
import com.w2a.API_Batch4_Rest_AFramework.util.Extentmanager;

import io.restassured.RestAssured;

public class TestSetup {

	public static ConfigProperties configProperties;
	public static ExtentReports extent;
	
	public static ThreadLocal<ExtentTest> classLevelLog = new ThreadLocal<ExtentTest>();
	public static ThreadLocal<ExtentTest> testLevelLog = new ThreadLocal<ExtentTest>();

	public static ExcelReader excel = new ExcelReader("./src/test/resources/testData/TestData.xlsx");

	@BeforeSuite
	public void setUp() {
		configProperties = ConfigFactory.create(ConfigProperties.class);

		RestAssured.baseURI = configProperties.getBaseURI();
		RestAssured.basePath = configProperties.getBasePath();
		extent=Extentmanager.GetExtent("./AutomationReport.html");
		
	}

	@BeforeTest
	public void beforeTest() {

	}

	@BeforeClass
	public void beforeClass() {
		ExtentTest classLevelTest = extent.createTest(getClass().getSimpleName());
		
		
		classLevelLog.set(classLevelTest);

	}

	@BeforeMethod
	public void beforeMethod(Method method) {

		ExtentTest test = classLevelLog.get().createNode(method.getName());
		
		
		testLevelLog.set(test);
	}

	@AfterMethod
	public void afterMethod(ITestResult testCaseResult) {
		if(testCaseResult.isSuccess())
		{
		  testLevelLog.get().pass("This test case got passed");	
		}
		else
		{
			testLevelLog.get().fail("This test case got failed");
		}
		
		extent.flush();

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
