package utils;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Specification {

    public static RequestSpecification requestSpec(){
        return new RequestSpecBuilder()
                .setBaseUri(Config.URL)
                .setContentType(ContentType.JSON)
                .build();
    }

    public static ResponseSpecification responseSpecStatusCodeOK(){
        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();
    }

    public static void setSpecification(RequestSpecification request, ResponseSpecification response){
        RestAssured.requestSpecification = request;
        RestAssured.responseSpecification = response;
    }
}
