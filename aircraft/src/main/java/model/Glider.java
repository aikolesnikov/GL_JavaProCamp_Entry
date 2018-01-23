package model;

import java.util.List;

/**
 * change doc
 */
public class Glider extends UnpoweredAircraft{

    public Glider() {
    }

    public Glider(String modelName, int length, int hight, int speed, int carryingCapacity, int totalCapacity, int flightRange, List<Uses> usesList) {
        super(modelName, length, hight, speed, carryingCapacity, totalCapacity, flightRange, usesList);
    }
}
