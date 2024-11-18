package ApiTesting;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class First {
	@BeforeTest
	public static void setup() {
		RestAssured.baseURI="https://fakestoreapi.com/";	
		
	}
	@Test
	public void checkstatuscode() {
	Response response=	given()
		.log().all()
		.when().get("/products")
		.then().log().all().extract().response();
	
	int id =response.jsonPath().getInt("[1].id");
	String title = response.jsonPath().get("[1].title");
	SoftAssert ass = new SoftAssert();
	ass.assertEquals(id, 3);
	ass.assertEquals(title, "Mens Casual Premium Slim Fit Shirts   ");
				
	}
	@Test
	public void addnewproduct() {
		given().body(" title: 'test product1',\r\n"
				+ "                    price: 13.5,\r\n"
				+ "                    description: 'lorem ipsum set',\r\n"
				+ "                    image: 'https://i.pravatar.cc',\r\n"
				+ "                    category: 'electronic'")
		.when().post("/products")
		.then().log().body();
	}

}
