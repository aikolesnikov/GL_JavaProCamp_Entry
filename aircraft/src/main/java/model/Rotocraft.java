package model;

import java.util.List;

/**
 * change doc
 */
public class Rotocraft extends PoweredAircraft {

    public Rotocraft() {
    }

    public Rotocraft(String modelName, int length, int hight, int speed, int carryingCapacity, int totalCapacity, int flightRange, List<Uses> usesList, int fuelConsumption) {
        super(modelName, length, hight, speed, carryingCapacity, totalCapacity, flightRange, usesList, fuelConsumption);
    }
}
