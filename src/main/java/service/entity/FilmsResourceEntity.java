package service.entity;

import java.util.ArrayList;
import java.util.Date;


public class FilmsResourceEntity {

    private String title;
    private Integer episode_id;
    private String opening_crawl;
    private String director;
    private String producer;
    private String release_date;
    private ArrayList<String> characters;
    private ArrayList<String> planets;
    private ArrayList<String> starships;
    private ArrayList<String> vehicles;
    private ArrayList<String> species;
    private Date created;
    private Date edited;
    private String url;

    public FilmsResourceEntity(String title, Integer episode_id, String opening_crawl, String director, String producer, String release_date, ArrayList<String> characters, ArrayList<String> planets, ArrayList<String> starships, ArrayList<String> vehicles, ArrayList<String> species, Date created, Date edited, String url) {
        this.title = title;
        this.episode_id = episode_id;
        this.opening_crawl = opening_crawl;
        this.director = director;
        this.producer = producer;
        this.release_date = release_date;
        this.characters = characters;
        this.planets = planets;
        this.starships = starships;
        this.vehicles = vehicles;
        this.species = species;
        this.created = created;
        this.edited = edited;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<String> getCharacters() {
        return characters;
    }

    public Integer getEpisode_id() {
        return episode_id;
    }

    public String getOpening_crawl() {
        return opening_crawl;
    }

    public String getDirector() {
        return director;
    }

    public String getProducer() {
        return producer;
    }

    public String getRelease_date() {
        return release_date;
    }

    public ArrayList<String> getPlanets() {
        return planets;
    }

    public ArrayList<String> getStarships() {
        return starships;
    }

    public ArrayList<String> getVehicles() {
        return vehicles;
    }

    public ArrayList<String> getSpecies() {
        return species;
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
}
