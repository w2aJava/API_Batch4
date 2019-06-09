package com.w2a.API_Batch4_Rest_AFramework.util;

import org.json.JSONObject;

public class TestUtils {
	
	public static boolean jsonHasKey(String json, String key)// id
	{
		JSONObject jsonObject= new JSONObject(json);
		boolean flag=jsonObject.has(key);
		return flag;
		
		//return json.contains(key);
		
		
	}

}
