package com.w2a.API_Batch4_Rest_AFramework.testcases;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.w2a.API_Batch4_Rest_AFramework.setUp.TestSetup;

import io.restassured.RestAssured;
import io.restassured.response.Response;
public class SampleTestCase  extends TestSetup{
	
	
	
	
	@Test
	public void validateCustomerAPIValidData() {
		
		
		Response response=given().auth().basic(configProperties.getValidSecretKey(), "")
		.formParam("email", "rest@gmail.com")
		.formParam("description", "Test User")
		.post("");
		
		response.prettyPrint();
		
		System.out.println(response.statusCode());// 200
	}
	
	@Test
	public void validateCreateCustomerAPIWithInvalidSecretKey()
	{
		
	
		
		Response response=given().auth().basic("sk_test_k43345345zxPb2wjsBPiIh7QxZKqJU3a", "")
				.formParam("email", "rest@gmail.com")
				.formParam("description", "Test User")
				.post("/customers");
				
				response.prettyPrint();
				System.out.println(response.statusCode());// 401
		
	}

}
