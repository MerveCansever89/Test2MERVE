package TestMerve;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

public class TestTwo {
    String url = "http://universities.hipolabs.com";

    @Test
    public void testOne(){
        Response response = RestAssured.given()
                .param("name", "Middle")
                .param("country", "Turkey")
                .get(url + "/search");

        System.out.println(response.getStatusCode());

        String responseBody = response.getBody().asString();

        System.out.println(responseBody);
    }
}
