package service.resource;

import io.restassured.specification.RequestSpecification;
import org.asynchttpclient.Request;
import service.entity.PeopleResourceEntity;
import service.entity.StarshipResourceEntity;
import utils.Config;

import static io.restassured.RestAssured.given;

public class StarshipResource {

    public static StarshipResourceEntity getStarshipEntity(String endpoint) {
        StarshipResourceEntity entity = given()
                .when()
                .get(Config.URL + endpoint)
                .then()
                .extract().body().jsonPath().getObject("", StarshipResourceEntity.class);
        return entity;
    }
}
