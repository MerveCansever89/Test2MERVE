package TestMerve;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;


import java.util.List;

public class TestOne {

    String url = "http://universities.hipolabs.com";

    @Test
    public void testOne(){

        Response response = RestAssured.given()
                .param("country", "United States")
                .get(url + "/search");

        List<String> universities = response.jsonPath().getList("name");

        System.out.println(universities);


    }
}
