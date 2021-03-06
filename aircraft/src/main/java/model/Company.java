package model;

import java.util.ArrayList;
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
        if (name != null)
            this.name = name;
        else
            this.name = Parameters.getDefCompanyName();
        this.aircraftList = new ArrayList<>();
    }

    public Company(long id, String name, List<Aircraft> aircraftList) {
        this.id = id;
        if (name != null)
            this.name = name;
        else
            this.name = Parameters.getDefCompanyName();
        if (aircraftList!=null)
            this.aircraftList = aircraftList;
        else
            this.aircraftList = new ArrayList<>();
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
        if (name != null)
            this.name = name;
        else
            this.name = Parameters.getDefCompanyName();
    }

    public List<Aircraft> getAircraftList() {
        return aircraftList;
    }

    public void setAircraftList(List<Aircraft> aircraftList) {
        if (aircraftList!=null)
            this.aircraftList = aircraftList;
        else
            this.aircraftList = new ArrayList<>();
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
