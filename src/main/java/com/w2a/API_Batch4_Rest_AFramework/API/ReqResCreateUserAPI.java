package com.w2a.API_Batch4_Rest_AFramework.API;

import static io.restassured.RestAssured.given;

import com.w2a.API_Batch4_Rest_AFramework.POJO.User;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ReqResCreateUserAPI {

	public static Response sendPostRequestWithValidData(String name, String job) {
		User user = new User(name, job);

		Response response = given().contentType(ContentType.JSON).body(user).post("https://reqres.in/api/users");

		return response;

	}

	public void sendPostRequestWithoutName() {

	}

	public void sendPostRequestWithoutJob() {

	}
}
