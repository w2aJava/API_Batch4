package com.w2a.API_Batch4_Rest_AFramework.util;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({ 
	"file:src/test/resources/propertyFiles/config.Properties" // mention the property file name
})
public interface ConfigProperties extends Config{
	
	@Key("baseURI")
	public String getBaseURI();
	
	@Key("basePath")
	public String getBasePath();
	
	@Key("validSecretKey")
	public String getValidSecretKey();
	
	@Key("customerAPIEndPoint")
	public String getCustomerAPIEndPoint();
}
