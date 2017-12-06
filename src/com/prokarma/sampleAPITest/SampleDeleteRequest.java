package com.prokarma.sampleAPITest;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import junit.framework.Assert;

import static com.jayway.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class SampleDeleteRequest {
	
	@Test
	public void deleteNameExample()
	{
	//String myJson = "{\"name\":\"Murthy\"}";
    	RestAssured.baseURI  = "http://127.0.0.1:5984/restassured?name=Murthy";	

    	Response r = given()
    	.contentType("application/json").
    	//body(myJson).
        when().
        delete("");

    	Assert.assertEquals(r.statusCode(),200);
    	String body = r.getBody().asString();
    	System.out.println(body);

	}

}
