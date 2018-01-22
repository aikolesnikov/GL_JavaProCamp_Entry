package model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCompany {
    @Before
    public void setup(){
        System.out.println("Test class setup");
    }

    @Test
    public void testCompany(){
        Company company1 = new Company(1, "firm1");
        // System.out.println(company1.toString());

        Assert.assertEquals(company1.toString(),"Company{id=1, name='firm1', aircraftList=null}");

    }


}
