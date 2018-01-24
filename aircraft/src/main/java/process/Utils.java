package process;

import model.Aircraft;
import model.Company;
import model.PoweredAircraft;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Utils {
    public static List<Aircraft> sortAircraftList(List<Aircraft> aircraftList,
                                                  Comparator<Aircraft> aircraftComparator) {

        List<Aircraft> tmpAircraftList = new ArrayList<>(aircraftList);

        if ((aircraftList != null) && (aircraftComparator != null)) {
            tmpAircraftList.sort(aircraftComparator);
        }

        return tmpAircraftList;
    }

    public static List<PoweredAircraft> findAircraftByFuelConsumtion(Company company, int fromRange, int toRange) {

        List<PoweredAircraft> tmpAircraftList = new ArrayList<>();
        if (company != null) {

            int fuelConsumption;
            for (Aircraft a : company.getAircraftList()) {
                if (a.getClass().getSuperclass().getSimpleName().equals("PoweredAircraft")) {
                    PoweredAircraft tmpPoweredAircraft = (PoweredAircraft) a;
                    fuelConsumption = tmpPoweredAircraft.getFuelConsumption();
                    if (fuelConsumption >= fromRange && fuelConsumption <= toRange)
                        tmpAircraftList.add((PoweredAircraft) a);
                }
            }
        }

        return tmpAircraftList;
    }

}
