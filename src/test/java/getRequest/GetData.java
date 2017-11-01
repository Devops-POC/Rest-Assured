package getRequest;

import org.testng.Assert;
import org.testng.annotations.*;
import io.restassured.*;
import io.restassured.response.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class GetData {
	
	//Checking the status of the API (Success/Failure)
	@Test
	public void testResponseergast()
	{		
		Response res = RestAssured.get("http://ergast.com/api/f1/2017/circuits.json");
		int code= res.getStatusCode();		
		System.out.println("status code = "+code);		
		Assert.assertEquals(code,200);	
	}
	
	//@Test
	//public void testfailResponseergast() throws Exception
	//{		
	//	Response res = RestAssured.get("http://ergast.com/api/f1/2017/circuits.json");
	//	int code= res.getStatusCode();		
	//	System.out.println("status code = "+code);		
	//	Assert.assertEquals(code,400);	
	//}
			
	//Extracting parameters from api and passing it to another  
	@Test
	public void test_ScenarioRetrieveFirstCircuitFor2017SeasonAndGetCountry_ShouldBeAustralia() {
	
	// First, retrieve the circuit ID for the first circuit of the 2017 season
    String circuitId = given().
	when().
	get("http://ergast.com/api/f1/2017/circuits.json").
    then().
	extract().
      path("MRData.CircuitTable.Circuits.circuitId[0]");
    
    System.out.println("CircuitId = " +circuitId);
	// Then, retrieve the information known for that circuit and verify it is located in Australia
     given().
     pathParam("circuitId",circuitId).
	when().
	get("http://ergast.com/api/f1/circuits/{circuitId}.json").
	then().
	assertThat().
	body("MRData.CircuitTable.Circuits.Location[0].country",equalTo("Australia"));
	} 
	
	
	//Parameterizing tests 
	@Test
	public void test_NumberOfCircuits_ShouldBe20_Parameterized() {

	String season = "2017";
	int numberOfRaces = 20;
	
	System.out.println("Nnumber of races= " + numberOfRaces);
	given().
	pathParam("raceSeason",season).
	when().
	get("http://ergast.com/api/f1/{raceSeason}/circuits.json").
	then().
	assertThat().
	body("MRData.CircuitTable.Circuits.circuitId",hasSize(numberOfRaces));
	} 







}
