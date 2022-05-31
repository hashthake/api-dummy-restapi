package com.restapiexample.employee;

import com.restapiexample.model.RestApiPojo;
import com.restapiexample.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PutEmployee extends TestBase {

    //    @Test
//    public void addEmployee(){
//        RestApiPojo restApiPojo = new RestApiPojo();
//
//        restApiPojo.setEmployee_name("Jira");
//        restApiPojo.setEmployee_salary(35000);
//        restApiPojo.setEmployee_age(35);
//
//        Response response = given()
//               // .pathParam("id",21)
//                .header("Content-Tye", "application/json")
//                .body(restApiPojo)
//                .when()
//                .put("/update/21");
//        response.then().statusCode(200);
//        response.prettyPrint();
//    }
    @Test
    public void createStudent() {

        RestApiPojo restApiPojo = new RestApiPojo();
        restApiPojo.setEmployee_name("Jira");
        restApiPojo.setEmployee_salary(20000);
        restApiPojo.setEmployee_age(40);


        Response response = given()
                .header("Content-Type", "application/json")
                //  .contentType(ContentType.JSON)

                .body(restApiPojo)
                .when()
                .put("/update/21");
        response.then().statusCode(200);
           response.prettyPrint();
    }
}