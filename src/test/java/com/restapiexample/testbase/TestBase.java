package com.restapiexample.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * Created by Jay Vaghani
 */
public class TestBase {

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "https://dummy.restapiexample.com";
       // RestAssured.port = 3030;
       RestAssured.basePath = "/api/v1";
    }
}
