package model;

import java.util.List;

public class UnpoweredAircraft extends Aircraft {

    public UnpoweredAircraft(){}

    public UnpoweredAircraft(String modelName, int length, int hight, int speed,
                             int carryingCapacity, int totalCapacity,
                             int flightRange, List<Uses> usesList) {
        super(modelName, length, hight, speed, carryingCapacity, totalCapacity, flightRange, usesList);
    }
}
