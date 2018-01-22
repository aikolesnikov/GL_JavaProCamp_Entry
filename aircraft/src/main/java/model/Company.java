package model;

import java.util.List;

/**
 * change doc
 */
public class Company {
    private long id;
    private String name;
    private List<Aircraft> aircraftList;

    public Company(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Company(long id, String name, List<Aircraft> aircraftList) {
        this.id = id;
        this.name = name;
        this.aircraftList = aircraftList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Aircraft> getAircraftList() {
        return aircraftList;
    }

    public void setAircraftList(List<Aircraft> aircraftList) {
        this.aircraftList = aircraftList;
    }


    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", aircraftList=" + aircraftList +
                '}';
    }
}
