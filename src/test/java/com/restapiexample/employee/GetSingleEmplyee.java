package com.restapiexample.employee;

import com.restapiexample.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetSingleEmplyee extends TestBase {

    @Test
    public void getSingleEmployee(){
        Response response = given()
                .pathParam("id",1)
                .when()
                .get("/employee/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
