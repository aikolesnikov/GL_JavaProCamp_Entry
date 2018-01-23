package model;

import java.util.List;

abstract class PoweredAircraft extends Aircraft {

    private int fuelConsumption;

    public PoweredAircraft(){}

    public PoweredAircraft(String modelName, int length, int hight, int speed,
                           int carryingCapacity, int totalCapacity, int flightRange,
                           List<Uses> usesList, int fuelConsumption) {
        super(modelName, length, hight, speed, carryingCapacity, totalCapacity, flightRange, usesList);
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
