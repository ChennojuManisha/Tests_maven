package parameter;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class examples {
	@Test
	public void getusersUsingPathAndQueryparam() {
		baseURI = "https://reqres.in/api";
		 given().header("x-api-key","reqres_706e0094770f44c3b75582f2b1128bfe")
		 .pathParam("userId",2)
		 .queryParam("page",1).
		 when().
		 get("api/users/{userid}").
		 then().
		 statusCode(200).log().all();
		 
	}
 
	

}
