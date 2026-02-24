package basicprogram;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;



public class auth_sam{

	@Test
	void diff_auth_method( ) {
		given().
		auth().
		basic("username","password")
		.when()
		.get("https://reqres.in/api")
		.then()
		.log().all().statusCode(200);
	}
	

}
