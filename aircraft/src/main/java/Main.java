import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main {

    private static Company InitCompany() {
        return new Company(1, "firm1");
    }

    private static List<Aircraft> InitAircraftsList() {
        List<Aircraft> aList = new ArrayList<Aircraft>();
        aList.add(new Balloon());
        aList.add(new Glider());
        aList.add(new JetAircraft());
        aList.add(new Kite());
        aList.add(new Propeller());
        aList.add(new Rotocraft());
        return aList;
    }


    public static void main(String[] args) throws Exception {
        Logger log = Logger.getLogger("Main");

        try {
            Company company = InitCompany();
            log.info(company.toString() + " has been created.");
            company.setAircraftList(InitAircraftsList());
            log.info("Company's aircraft list is set as: " + company.getAircraftList());

        } catch (Exception e) {
            log.severe(e.getStackTrace().toString());
        }
    }
}
