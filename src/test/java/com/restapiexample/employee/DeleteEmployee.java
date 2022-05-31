package com.restapiexample.employee;

import com.restapiexample.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteEmployee extends TestBase {

    @Test
    public void deleteEmployee(){
        Response response = given()
                .when()
                .delete("/delete/2");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
