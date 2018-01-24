package process;

import model.Aircraft;
import model.Company;

public class Statistics {

    public static long totalCapacity(Company company) {
        long tCapacity = 0;
        for (Aircraft a : company.getAircraftList()) {
            tCapacity += a.getTotalCapacity();
        }
        return tCapacity;
    }

    public static long carryingCapacity(Company company) {
        long cCapacity = 0;
        for (Aircraft a : company.getAircraftList()) {
            cCapacity += a.getCarryingCapacity();
        }
        return cCapacity;
    }
}
