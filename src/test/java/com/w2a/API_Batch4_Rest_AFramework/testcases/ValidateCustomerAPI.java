package com.w2a.API_Batch4_Rest_AFramework.testcases;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.w2a.API_Batch4_Rest_AFramework.setUp.TestSetup;

import io.restassured.response.Response;

public class ValidateCustomerAPI extends TestSetup {

	@Test
	public void validateCreateCustomerAPI()
	{
		Response response=given().auth().basic(configProperties.getValidSecretKey(), "").
		formParam("email", "rest@gmail.com")
		.formParam("description", "Test User")
		.post(configProperties.getCustomerAPIEndPoint());
		
		response.prettyPrint();
		
		System.out.println(response.statusCode());
		
	}

	@Test
	public void validateCustomerAPIInvalidKey() {

	}

	@Test
	public void validateDeleteAPI() {

	}

	@Test
	public void retriveCustomer() {

	}

}
