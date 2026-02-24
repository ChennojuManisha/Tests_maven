package basicprogram;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class putpush {
	@Test
	public void test_put() {
		JSONObject request = new JSONObject();
		request.put("name","manisha");
		request.put("job", "software");
		
		
		given().
		 header("Content-Type","application/json").
		 header("x-api-key","reqres_706e0094770f44c3b75582f2b1128bfe").
		body(request.toJSONString()).
		when().
		put("https://reqres.in/api/users/2").
		then().
		statusCode(200).log().all();
		
	}
		@Test
		public void test_delete() {
			JSONObject request = new JSONObject();
			request.put("name","manisha");
			request.put("job", "software");
			
			
			given().
			 header("Content-Type","application/json").
			 header("x-api-key","reqres_706e0094770f44c3b75582f2b1128bfe").
			body(request.toJSONString()).
			when().
			delete("https://reqres.in/api/users").
		   then().
		   statusCode(204).log().all();
			
		   
			
	}

	
}
