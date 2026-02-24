package basicprogram;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;



public class getname {
	@Test
	void test_get() {
		 baseURI = "https://reqres.in/api";
		 given().header("x-api-key","reqres_706e0094770f44c3b75582f2b1128bfe")
		 .get("/users?page=2")
		 .then().statusCode(200).log().all();
	}
	
	@Test
	void test_get1() {
	RequestSpecification httpRequest = RestAssured.given();
	httpRequest.header("x-api-key","reqres_706e0094770f44c3b75582f2b1128bfe");
	httpRequest.baseUri("https://reqes.in/api");
	Response response = httpRequest.get("/users?page=2");
	System.out.println(response.getBody().asString());
	System.out.println(response.getStatusCode());
	System.out.println(response.getStatusLine());
	System.out.println(response.getHeader("content-type"));
	int code =response.getStatusCode();
	Assert.assertEquals(code,200);
	
	
		
	

}
	@Test//(enabled=false)
	void test_get2() {
		baseURI = "https://reqres.in/api";
		 given().header("x-api-key","reqres_706e0094770f44c3b75582f2b1128bfe\n")
		 .get("/users?page=2")
		 .then().statusCode(200)
		 .body("data[4j.first_name",equalTo("Geroge"))
		 .body("data.first_name",hasItems("Geroge","Rachel"));
		 
	}
	
}


