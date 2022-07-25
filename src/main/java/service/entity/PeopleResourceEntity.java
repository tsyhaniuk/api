package service.entity;

import java.util.ArrayList;
import java.util.Date;

public class PeopleResourceEntity {
    private String name;
    private String height;
    private String mass;
    private String hair_color;
    private String skin_color;
    private String eye_color;
    private String birth_year;
    private String gender;
    private String homeworld;
    private ArrayList<String> films;
    private ArrayList<Object> species;
    private ArrayList<Object> vehicles;
    private ArrayList<String> starships;
    private Date created;
    private Date edited;
    private String url;

    public PeopleResourceEntity(String name, String height, String mass, String hair_color, String skin_color, String eye_color, String birth_year, String gender, String homeworld, ArrayList<String> films, ArrayList<Object> species, ArrayList<Object> vehicles, ArrayList<String> starships, Date created, Date edited, String url) {
        this.name = name;
        this.height = height;
        this.mass = mass;
        this.hair_color = hair_color;
        this.skin_color = skin_color;
        this.eye_color = eye_color;
        this.birth_year = birth_year;
        this.gender = gender;
        this.homeworld = homeworld;
        this.films = films;
        this.species = species;
        this.vehicles = vehicles;
        this.starships = starships;
        this.created = created;
        this.edited = edited;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getHeight() {
        return height;
    }

    public String getMass() {
        return mass;
    }

    public String getHair_color() {
        return hair_color;
    }

    public String getSkin_color() {
        return skin_color;
    }

    public String getEye_color() {
        return eye_color;
    }

    public String getBirth_year() {
        return birth_year;
    }

    public String getGender() {
        return gender;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public ArrayList<String> getFilms() {
        return films;
    }

    public ArrayList<Object> getSpecies() {
        return species;
    }

    public ArrayList<Object> getVehicles() {
        return vehicles;
    }

    public ArrayList<String> getStarships() {
        return starships;
    }

    public Date getCreated() {
        return created;
    }

    public Date getEdited() {
        return edited;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
