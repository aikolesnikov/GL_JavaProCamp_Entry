package model;

import java.util.List;

/**
 * chane doc
 */
public abstract class Aircraft {
    private int length;
    private int hight;
    private int speed;
    private int carryingCapacity;
    private int totalCapacity;
    private int flightRange;
    private String modelName;
    private enum MethodOfLifT {LIGHTER_THAN_AIR, HEAVIER_THAN_AIR}
    private List<Uses> usesList;
}
