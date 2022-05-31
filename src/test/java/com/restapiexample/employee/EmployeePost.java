package com.restapiexample.employee;

import com.restapiexample.model.RestApiPojo;
import com.restapiexample.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class EmployeePost extends TestBase {


    @Test

    public void createNewEmployee(){
        RestApiPojo restApiPojo = new RestApiPojo();

        restApiPojo.setEmployee_name("Jisu");
        restApiPojo.setEmployee_salary(15000);
        restApiPojo.setEmployee_age(40);

        Response response = given()
                .header("Content-Type", "application/json")
                .body(restApiPojo)
                .when()
                .post("/create");
        //response.then().statusCode(200);
        response.prettyPrint();
    }
}
