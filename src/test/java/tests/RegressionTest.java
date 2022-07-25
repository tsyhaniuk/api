package tests;

import constants.Constant;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import service.entity.FilmsResourceEntity;
import service.entity.PeopleResourceEntity;
import service.entity.StarshipResourceEntity;
import service.resource.FilmsResource;
import service.resource.PeopleResource;
import service.resource.StarshipResource;
import utils.Config;

import java.util.List;
import java.util.stream.Collectors;

import static java.net.HttpURLConnection.HTTP_OK;

public class RegressionTest {

    private Response response;
    private FilmsResourceEntity aNewHopeFilm;
    private PeopleResourceEntity biggsDarklighter;
    private PeopleResourceEntity lukeSkywalker;
    private StarshipResourceEntity starship;

    @Test
    public void e2eTest() {
        response = FilmsResource.getFilmsResponse();
        Assert.assertEquals(response.statusCode(), Config.HTTP_OK, "Status code is NOT " + HTTP_OK + "!");
        List<FilmsResourceEntity> films = response.body().jsonPath().getList("results", FilmsResourceEntity.class);

        films = films.stream().filter(x -> x.getTitle().equals(Constant.FILM_TITLE)).collect(Collectors.toList());
        Assert.assertEquals(films.size(), 1, "List contains more than one element!");
        aNewHopeFilm = films.get(0);
        Assert.assertEquals(aNewHopeFilm.getTitle(), Constant.FILM_TITLE, "Film is NOT " + Constant.FILM_TITLE);
        System.out.println(aNewHopeFilm + " title is \"A New Hope\"");

        List<String> characters = aNewHopeFilm.getCharacters();
        List<String> characterEndpoints = characters.stream().map(x -> x.substring(17)).collect(Collectors.toList());

        List<PeopleResourceEntity> people = PeopleResource.setObjectFromResponse(characterEndpoints);
        people = people.stream().filter(x -> x.getName().equals(Constant.CHARACTER_NAME)).collect(Collectors.toList());
        Assert.assertEquals(people.size(), 1, "List contains more than one element!");
        biggsDarklighter = people.get(0);
        Assert.assertEquals(biggsDarklighter.getName(), Constant.CHARACTER_NAME, "Character is NOT " + Constant.CHARACTER_NAME);
        System.out.println(biggsDarklighter.getName() + " was among characters that were part of \"A New Hope\"");

        List<String> starshipEndpoints = biggsDarklighter.getStarships();
        starshipEndpoints = starshipEndpoints.stream().map(s -> s.substring(17)).collect(Collectors.toList());
        Assert.assertEquals(people.size(), 1, "List contains more than one element!");
        String starshipEndpoint = starshipEndpoints.get(0);

        starship = StarshipResource.getStarshipEntity(starshipEndpoint);
        Assert.assertEquals(starship.getName(), Constant.STARSHIP_NAME, "Starship name is NOT " + Constant.STARSHIP_NAME);
        Assert.assertEquals(starship.getModel(), Constant.STARSHIP_MODEL, "Starship name is NOT " + Constant.STARSHIP_MODEL);
        Assert.assertEquals(starship.getManufacturer(), Constant.STARSHIP_MANUFACTURER, "Starship name is NOT " + Constant.STARSHIP_MANUFACTURER);
        System.out.println(biggsDarklighter.getName() + " was flying on " + starship.getName() + " model " + starship.getModel() + " produced by " + starship.getManufacturer());


        Assert.assertEquals(starship.getStarship_class(), Constant.STARSHIP_CLASS, "Starship class in NOT " + Constant.STARSHIP_CLASS);
        System.out.println(starship.getName() + " is the " + starship.getStarship_class() + " class starship");

        characterEndpoints = starship.getPilots();
        characterEndpoints = characterEndpoints.stream().map(s -> s.substring(17)).collect(Collectors.toList());
        List<PeopleResourceEntity> starshipPilots = PeopleResource.setObjectFromResponse(characterEndpoints);
        starshipPilots = starshipPilots.stream().filter(x -> x.getName().equals(Constant.LUKE_SKYWALKER)).collect(Collectors.toList());
        Assert.assertEquals(starshipPilots.size(), 1, "List contains more than one element!");
        lukeSkywalker = starshipPilots.get(0);
        Assert.assertEquals(lukeSkywalker.getName(), Constant.LUKE_SKYWALKER, Constant.LUKE_SKYWALKER + " is NOT among pilots who were flying on " + Constant.STARSHIP_MODEL);
        System.out.println(lukeSkywalker.getName() + " was among pilots who were flying on " + starship.getModel() + " model");
    }
}










