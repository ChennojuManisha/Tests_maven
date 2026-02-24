package basicprogram;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;

public class ratios {
	@Test
	public void two() {
		RestAssured.baseURI = "https://api.github.com";
		RestAssured.basePath = "/users/ChennojuManisha/repos";
     String token = " ghp_y9qjKdCQ4dKKG9LVjRKesuC3d0LRm1w8Kpu";
     ResponseOptions res2=(ResponseOptions) RestAssured.given().auth().oauth2(token);
     System.out.println(res2.toString());
    		 

       
	

}
}
