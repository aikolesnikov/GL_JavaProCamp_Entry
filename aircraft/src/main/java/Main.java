import model.Aircraft;
import model.Company;
import model.Rotocraft;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Company company1 = new Company(1, "firm1");
        System.out.println(company1.toString());

        Rotocraft rt1 = new Rotocraft();
        System.out.println(rt1.getFuelConsumption());

        company1.getAircraftList().add(new Rotocraft());

        System.out.println(company1.getAircraftList());
        System.out.println(company1.getAircraftList().get(0).getUsesList());
    }
}
