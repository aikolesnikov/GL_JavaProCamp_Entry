package process;


import model.Aircraft;
import model.Company;
import view.Menu;

import java.util.Comparator;
import java.util.Scanner;

/**
 * change
 */
public class MainProcessing {
    public static void initProcess(Company company){
        int menuChoice;
        while ((menuChoice = Menu.initMenu()) != 4) {
            switch (menuChoice){
                case 1:
                    System.out.println("Total capacity: " +
                            Statistics.totalCapacity(company));
                    System.out.println("Carrying capacity: " +
                            Statistics.carryingCapacity(company));
                    break;
                case 2:
                    Comparator<Aircraft> aircraftComparator =
                            Comparator.comparing(Aircraft::getFlightRange);
                    System.out.println(Utils.sortAircraftList(company.getAircraftList(),
                            aircraftComparator));
                    break;
                case 3:
                    System.out.println("Input range (from to)");
                    Scanner in = new Scanner(System.in);

                    try{
                        System.out.println(Utils.findAircraftByFuelConsumtion(
                                company, in.nextInt(),in.nextInt()));
                    }
                    catch (Exception e){
                        System.out.println("Wrong input.");
                    }
            }
        }
    }
}
