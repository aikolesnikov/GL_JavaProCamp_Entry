package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * chane doc
 */

public abstract class Aircraft implements Comparable<Aircraft> {
    private int length;
    private int hight;
    private int speed;
    private int carryingCapacity;
    private int totalCapacity;
    private int flightRange;
    private String modelName;
    private List<Uses> usesList;

    Aircraft() {
        this.modelName = Parameters.getDefAircraftName();
        usesList = new ArrayList<Uses>();
    }

    public Aircraft(String modelName) {
        if (modelName != null)
            this.modelName = modelName;
        else this.modelName = Parameters.getDefAircraftName();
        usesList = new ArrayList<Uses>();
    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public int getFlightRange() {
        return flightRange;
    }

    public void setFlightRange(int flightRange) {
        this.flightRange = flightRange;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public List<Uses> getUsesList() {
        return usesList;
    }

    public void setUsesList(List<Uses> usesList) {
        this.usesList = usesList;
    }

    public int compareTo(Aircraft a) {
        if (this.getFlightRange() < a.getFlightRange())
            return 1;
        else if (this.getFlightRange() > a.getFlightRange())
            return -1;
        else
            return 0;
    }

    public Iterator<Aircraft> iterator() {
        return null;
    }
}
