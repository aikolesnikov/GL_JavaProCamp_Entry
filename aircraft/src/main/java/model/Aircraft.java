package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * change doc
 */

// implements Comparable<Aircraft>
public abstract class Aircraft  {
    private String modelName;
    private int length;
    private int hight;
    private int speed;
    private int carryingCapacity;
    private int totalCapacity;
    private int flightRange;
    private List<Uses> usesList;

    Aircraft() {
        this.modelName = Parameters.getDefAircraftName();
        usesList = new ArrayList<>();
    }

    public Aircraft(String modelName) {
        if (modelName != null)
            this.modelName = modelName;
        else this.modelName = Parameters.getDefAircraftName();
        usesList = new ArrayList<>();
    }

    public Aircraft(String modelName, int length, int hight, int speed,
                    int carryingCapacity, int totalCapacity,
                    int flightRange, List<Uses> usesList) {
        this.modelName = modelName;
        this.length = length;
        this.hight = hight;
        this.speed = speed;
        this.carryingCapacity = carryingCapacity;
        this.totalCapacity = totalCapacity;
        this.flightRange = flightRange;
        this.usesList = usesList;
    }


    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
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

    public List<Uses> getUsesList() {
        return usesList;
    }

    public void setUsesList(List<Uses> usesList) {
        this.usesList = usesList;
    }

    @Override
    public String toString(){
        return modelName;
    }

}
