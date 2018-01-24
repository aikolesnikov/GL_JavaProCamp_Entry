package model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.logging.Logger;

/**
 * change
 */
public class TestAircraft {
    private Logger log = Logger.getLogger(this.getClass().getName());

    @Test
    public void testAircraft() {

        log.info("Checking of default model");
        Aircraft a = new Aircraft(){};
        Assert.assertEquals(a.getModelName(),Parameters.getDefAircraftName());

        log.info("Checking of sub models");
        Balloon b = new Balloon("BallonModel1", 1, 2, 3,
                4, 5, 200, null);
        Glider g = new Glider("GliderModel1", 3,
                4, 5, 6, 7, 300, null);
        JetAircraft j = new JetAircraft("JetModel1",
                4, 5, 6, 7, 8, 777, null, 10);
        Kite k = new Kite("KiteModel1", 5, 6, 7,
                8, 9, 100, null);
        Propeller p = new Propeller("PropellerModel1",
                6, 7, 8, 9, 10, 444, null, 12);
        Rotocraft r = new Rotocraft("RotocraftModel1",
                7, 8, 9, 10, 11, 555, null, 13);


        Assert.assertTrue(b.toString().equals("BallonModel1"));
        Assert.assertEquals(r.getCarryingCapacity(),10);
    }
}
