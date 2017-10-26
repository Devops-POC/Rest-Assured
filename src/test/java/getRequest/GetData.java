package getRequest;

import org.testng.Assert;
import org.testng.annotations.*;
import io.restassured.*;
import io.restassured.response.*;



public class GetData {
	@Test
	public void testResponseergast()
	{
		
		Response res = RestAssured.get("http://ergast.com/api/f1/2017/circuits.json");
		int code= res.getStatusCode();
		
		System.out.println("status code = "+code);
		
		Assert.assertEquals(code,200);
		
		
	}
	
	@Test
	public void testResponseweather()
	{
		Response res = RestAssured.get("http://ergast.com/api/f1/2017/circuits.json");
		
		int code= res.getStatusCode();
		
		System.out.println("status code = "+code);
		
		Assert.assertEquals(code,200);
		
		
	}


}
