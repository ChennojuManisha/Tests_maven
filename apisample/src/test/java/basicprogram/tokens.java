package basicprogram;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class tokens {
	@Test(enabled=true)
	public void two() {
		RestAssured.baseURI = "https://api.github.com";
		RestAssured.basePath = "/users/ChennojuManisha/repos";
		RequestSpecification requestspec = RestAssured.given();
requestspec.header("Autorization","Bearer ghp_y9qjKdCQ4dKKG9LVjRKesuC3d0LRm1w8Kpu");
Response response = requestspec.get();
  JsonPath jsonpath = response.jsonPath();
  String reposname = jsonpath.getString("name");
  System.out.println(reposname);
  Assert.assertEquals(response.statusCode(),200);
  		

	}

}
