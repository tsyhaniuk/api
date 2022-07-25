package service.resource;

import endpoints.Endpoint;
import io.restassured.response.Response;
import utils.Config;

import static io.restassured.RestAssured.given;

public class FilmsResource {

    public static Response getFilmsResponse(){
        Response response = given()
                .when()
                .get(Config.URL + Endpoint.FILMS_ENDPOINT);
        return response;
    }
}
