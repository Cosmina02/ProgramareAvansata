package compulsory;

import java.io.Serializable;

abstract public class Item implements Serializable {
    private String id;
    private String name;
    private String location;
    private int releaseYear;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
