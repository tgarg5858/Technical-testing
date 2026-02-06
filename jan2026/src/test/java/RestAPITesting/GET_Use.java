package RestAPITesting;

import org.testng.annotations.Test;
import com.aventstack.extentreports.gherkin.model.Given;

import io.restassured.RestAssured;
import io.restassured.response.Response;
 

 
public class GET_Use {
	@Test
	  public void getuser() {
		  
		  RestAssured.baseURI="https://api.restful-api.dev";
		  
		  RestAssured.given()
				  .when()
				  .get("/objects")
				  .then()
				  .statusCode(200)
				  .log().all();
				
		  
	  }
}

 

 