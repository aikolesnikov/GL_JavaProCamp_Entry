package model;

import java.util.List;

/**
 * change doc
 */
public class Balloon extends UnpoweredAircraft {

    public Balloon() {
    }

    public Balloon(String modelName, int length, int hight, int speed, int carryingCapacity, int totalCapacity, int flightRange, List<Uses> usesList) {
        super(modelName, length, hight, speed, carryingCapacity, totalCapacity, flightRange, usesList);
    }
}
