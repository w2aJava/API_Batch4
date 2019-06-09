package com.w2a.API_Batch4_Rest_AFramework.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.API_Batch4_Rest_AFramework.API.CreateCustomerAPI;
import com.w2a.API_Batch4_Rest_AFramework.setUp.TestSetup;
import com.w2a.API_Batch4_Rest_AFramework.util.Data;
import com.w2a.API_Batch4_Rest_AFramework.util.TestUtils;

import io.restassured.response.Response;

public class ValidateCreateCustomerAPI extends TestSetup {

	@Test(dataProvider="data",dataProviderClass=Data.class)
	public void validateAPIWIthValidSecretKey(Hashtable<String, String> data) {
		
		testLevelLog.get().assignAuthor("Rahul Jha");
		testLevelLog.get().assignCategory("Regression");
		Response response = CreateCustomerAPI.sendPostRequestToCreateACustomer(data.get("email"),
				data.get("description"), configProperties.getValidSecretKey(),
				configProperties.getCustomerAPIEndPoint());
		
		testLevelLog.get().info(response.asString());
		
		response.prettyPrint();

		// Assert the status code to be 200
		testLevelLog.get().info("Status code in the response :-"+response.getStatusCode());

		Assert.assertEquals(response.statusCode(), 200);

		// Assert the response json contains Id field
		testLevelLog.get().info("The value of customerId in Response :- "+response.jsonPath().get("id"));

		Assert.assertTrue(TestUtils.jsonHasKey(response.asString(), "id"));

		// Assert that the id field is not null
		String idValue = response.jsonPath().get("id");
		Assert.assertNotNull(idValue);

	}

/*	@Test
	public void validateAPIWIthInValidSecretKey() {

	}

	@Test
	public void validateAPIWIthValidParameters() {

	}*/

}
