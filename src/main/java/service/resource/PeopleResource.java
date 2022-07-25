package service.resource;

import service.entity.PeopleResourceEntity;
import utils.Config;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class PeopleResource {

    public static List<PeopleResourceEntity> setObjectFromResponse(List<String> endpoints) {
        List<PeopleResourceEntity> people = new ArrayList<>();
        for (int i = 0; i < endpoints.size(); i++) {
            people.add(given()
                    .when()
                    .get(Config.URL + endpoints.get(i))
                    .then()
                    .extract().body().jsonPath().getObject("", PeopleResourceEntity.class));
        }
        return people;
    }
}




