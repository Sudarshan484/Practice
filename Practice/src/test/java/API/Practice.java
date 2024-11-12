package API;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class Practice {

	public static void main(String[] args) {


		RestAssured.baseURI= "https://restful-booker.herokuapp.com";
		String responce= given().header("Content-Type","application/json")
		.body("{\r\n"
				+ "    \"username\" : \"admin\",\r\n"
				+ "    \"password\" : \"password123\"\r\n"
				+ "}")
		.when().post("auth")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println(responce);
		JsonPath js = new JsonPath(responce);
		String Token = js.getString("token");
		
		System.out.println(Token);
		
		String bookingresponce = when().get("booking")
		.then().extract().response().asPrettyString();
		
		
		JsonPath js2 = new JsonPath(bookingresponce);
		System.out.println(js2.getInt("bookingid.size()"));
		
		String sallyBooking = given().queryParam("firstnameoptional", "sally")
		.when().get("booking")
		.then().extract().asPrettyString();
		
		
		
		JsonPath js1 = new JsonPath(sallyBooking);
		System.out.println(js1.getInt("bookingid.size()"));
		
		
	}

}
