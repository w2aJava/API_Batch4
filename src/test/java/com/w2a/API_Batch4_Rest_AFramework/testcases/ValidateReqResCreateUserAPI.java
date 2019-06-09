package com.w2a.API_Batch4_Rest_AFramework.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.w2a.API_Batch4_Rest_AFramework.API.ReqResCreateUserAPI;
import com.w2a.API_Batch4_Rest_AFramework.setUp.TestSetup;
import com.w2a.API_Batch4_Rest_AFramework.util.Data;

import io.restassured.response.Response;

public class ValidateReqResCreateUserAPI extends TestSetup {

	@Test(dataProviderClass = Data.class, dataProvider = "data")
	public void validateCreateUserValidData(Hashtable<String, String> data) {
		Response response = ReqResCreateUserAPI.sendPostRequestWithValidData(data.get("name"), data.get("job"));
		response.prettyPrint();

	}

}
