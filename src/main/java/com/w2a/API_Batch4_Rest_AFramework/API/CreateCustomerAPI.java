package com.w2a.API_Batch4_Rest_AFramework.API;

import com.w2a.API_Batch4_Rest_AFramework.setUp.TestSetup;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class CreateCustomerAPI extends TestSetup{
	
	
	public static Response sendPostRequestToCreateACustomer(String email,String description,String validSecretKey,String endPoint)
	{
		Response response=given().auth().basic(validSecretKey, "").
		formParam("email",email)
		.formParam("description", description)
		.post(endPoint);
		
		return response;
		
		
	}
	
	public static Response sendPostRequestToCreateACustomerWithInvalidKey(String email,String description,String invalidSecretKey,String endPoint)
	{
		Response response=given().auth().basic(invalidSecretKey, "").
		formParam("email",email)
		.formParam("description", description)
		.post(endPoint);
		
		return response;
		
		
	}
	
	
	public static  Response sendPostRequestToCreateACustomerWithoutSecretKey(String email,String description,String endPoint)
	{
		Response response=given().auth().basic("", "").
		formParam("email",email)
		.formParam("description", description)
		.post(endPoint);
		
		return response;
		
		
	}
}
