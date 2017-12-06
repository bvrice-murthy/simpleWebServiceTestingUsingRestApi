package com.prokarma.sampleAPITest;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;

public class SimpleGetRequest {

	@Test
	public void checkResponse(){
		get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1").
		then().
		assertThat().
		statusCode(200);

	}
	
	//Parametrs passing and getting response as string and checking the response code
	@Test
	public void checkResponsebyParamaters(){
		Response resp=given().
		param("q", "London").
		param("appid", "260b03b97286a717e7b070b96a1bf869").
		get("http://samples.openweathermap.org/data/2.5/weather");		
		System.out.println(resp.asString());
		Assert.assertEquals(resp.getStatusCode(), 200);
		
		
		
	}
	
	//Authentication mode 
	@Test
	public void checkAuthenticationResponse(){
		Response resp=given().
				param("q", "London").authentication().oauth2("260b03b97286a717e7b070b96a1bf869").
				get("http://samples.openweathermap.org/data/2.5/weather");		
				System.out.println(resp.asString());
				Assert.assertEquals(resp.getStatusCode(), 200);
	}
	
	//if no authentication then it should give 401 status
	@Test
	public void checkHeaders(){
		Response resp= given().
				param("q","london").
				get("http://samples.openweathermap.org/data/2.5/weather");
		Assert.assertEquals(resp.getStatusCode(), 200);
		
		
				
	}

}
