package service.entity;

import java.util.ArrayList;
import java.util.Date;

public class StarshipResourceEntity {
    private String name;
    private String model;
    private String manufacturer;
    private String cost_in_credits;
    private String length;
    private String max_atmosphering_speed;
    private String crew;
    private String passengers;
    private String cargo_capacity;
    private String consumables;
    private String hyperdrive_rating;
    private String mGLT;
    private String starship_class;
    private ArrayList<String> pilots;
    private ArrayList<String> films;
    private Date created;
    private Date edited;
    private String url;

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getCost_in_credits() {
        return cost_in_credits;
    }

    public String getLength() {
        return length;
    }

    public String getMax_atmosphering_speed() {
        return max_atmosphering_speed;
    }

    public String getCrew() {
        return crew;
    }

    public String getPassengers() {
        return passengers;
    }

    public String getCargo_capacity() {
        return cargo_capacity;
    }

    public String getConsumables() {
        return consumables;
    }

    public String getHyperdrive_rating() {
        return hyperdrive_rating;
    }

    public String getmGLT() {
        return mGLT;
    }

    public String getStarship_class() {
        return starship_class;
    }

    public ArrayList<String> getPilots() {
        return pilots;
    }

    public ArrayList<String> getFilms() {
        return films;
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
