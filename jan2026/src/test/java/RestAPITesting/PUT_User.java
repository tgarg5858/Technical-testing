package RestAPITesting;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
 
import io.restassured.http.ContentType;
 
import static io.restassured.RestAssured.*;
 
 
public class PUT_User {
	  @Test
	  public void postuser() {
		  baseURI = "https://api.restful-api.dev";
		  JSONObject data=new JSONObject();
		  data.put("year", 2019);
		  data.put("price", 6000.00 );
		  data.put("CPU model", "Intel Core i9");
		  data.put("Hard disk size","1 TB");
		  data.put("color","silver");
		  JSONObject reqbody=new JSONObject();
		  reqbody.put("name", "Apple MacBook Pro 16");
		  reqbody.put("data",data);
		  given()
		  .contentType(ContentType.JSON)
		  .body(reqbody.toString())
		  .when()
		  .post("/objects/ff8081819782e69e019c12461c273059")
		  .then()
		  .statusCode(200)
		  .log().all();
	  }

}
