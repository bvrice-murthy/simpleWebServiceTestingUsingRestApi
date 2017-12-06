package com.prokarma.sampleAPITest;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import junit.framework.Assert;

import static com.jayway.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class SimplePostRequest {
	
	 @Test
		public void postNameExample()
		{
		String myJson = "{\"name\":\"Jimi Hendrix\"}";
	    	RestAssured.baseURI  = "http://127.0.0.1:5984/restassured";	

	    	Response r = given()
	    	.contentType("application/json").
	    	body("{\"name\":\"Murthy\"}").
	        when().
	        post("");

	    	Assert.assertEquals(r.statusCode(),201);
	    	String body = r.getBody().asString();
	    	System.out.println(body);

		}
		
		//@Test
		public void checkThePostedRequest(){
			RestAssured.baseURI  = "http://127.0.0.1:5984/restassured";	
			Response r = given().param("_id","07ea0c4466da452768da5d84c2002217")
			    	.contentType("application/json").
			        when().
			        get("");
			System.out.println(r.asString());
		}

}
