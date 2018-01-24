import model.*;
import process.Statistics;
import process.Utils;
import view.Menu;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;

public class Main {

    private static Company InitCompany() {
        return new Company(1, "firm1");
    }

    private static List<Aircraft> InitAircraftsList() {
        List<Aircraft> aList = new ArrayList<>();


        Balloon b = new Balloon("BallonModel1", 1, 2, 3,
                4, 5, 200, null);
        Glider g = new Glider("GliderModel1", 3,
                4, 5, 6, 7, 300,null);
        JetAircraft j = new JetAircraft("JetModel1",
                4, 5, 6, 7, 8,777, null, 10);
        Kite k = new Kite("KiteModel1", 5, 6, 7,
                8,9, 100, null);
        Propeller p = new Propeller("PropellerModel1",
                6, 7, 8,9, 10, 444, null, 12);
        Rotocraft r = new Rotocraft("RotocraftModel1",
                7, 8,9, 10, 11, 555, null, 13);

        aList.add(b);
        aList.add(g);
        aList.add(j);
        aList.add(k);
        aList.add(p);
        aList.add(r);

        return aList;
    }


    public static void main(String[] args) throws Exception {
        Logger log = Logger.getLogger("Main");

        try {
            Company company = InitCompany();
            log.info(company.toString() + " has been created.");
            company.setAircraftList(InitAircraftsList());
            log.info("Company's aircraft list is set as: " + company.getAircraftList());
            System.out.println();

            Menu.initMenu();


            /*            System.out.println(Statistics.totalCapacity(company));

            Comparator<Aircraft> aircraftComparator = Comparator.comparing(Aircraft::getFlightRange);
            System.out.println(Utils.sortAircraftList(company.getAircraftList(), aircraftComparator));
            System.out.println(company.getAircraftList());

            System.out.println();

            System.out.println(Utils.findAircraftByFuelConsumtion(company, 9,14));
*/

        } catch (Exception e) {
            log.severe(e.getCause().toString());
        }
    }
}
