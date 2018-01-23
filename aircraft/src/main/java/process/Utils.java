package process;

import model.Aircraft;

import java.util.Comparator;
import java.util.List;

public class Utils {
    public static List<Aircraft> sortAircraftList(List<Aircraft> aircraftList){

        System.out.println(aircraftList);

        Comparator<Aircraft> aircraftComparator = Comparator.comparing(Aircraft::getFlightRange);
        aircraftList.sort(aircraftComparator);

        System.out.println(aircraftList);
        return null;
    }

}
