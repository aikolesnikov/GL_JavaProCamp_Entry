package model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.logging.Logger;

public class TestCompany {
    private static Company company = new Company(1, Parameters.getDefCompanyName());
    private Logger log = Logger.getLogger(this.getClass().getName());

    @Before
    public void setup() {
        log.info("Before method started");
    }

    @Test
    public void testCompany() {
        log.info("Check of company setName");
        company.setName(null);
        Assert.assertEquals(company.getName(),Parameters.getDefCompanyName());
        company.setName("firm1");
        Assert.assertEquals(company.getName(),"firm1");
        Assert.assertEquals(company.toString(), "Company{id=1, name='firm1', aircraftList=[]}");

        log.info("Check of aircraft list's setting.");
        company.setAircraftList(null);
        Assert.assertEquals(company.getAircraftList().toString(),"[]");
        company.getAircraftList().add(new Balloon());
        company.getAircraftList().add(new Glider());
        company.getAircraftList().add(new JetAircraft());
        company.getAircraftList().add(new Kite());
        company.getAircraftList().add(new Propeller());
        company.getAircraftList().add(new Rotocraft());
        Assert.assertTrue(company.getAircraftList().size()==6);
    }

}
