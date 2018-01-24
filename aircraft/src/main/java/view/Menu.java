package view;

import java.util.Scanner;

public class Menu {
    static public int initMenu(){
        int selection=0;
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("Choose from these choices:");
        System.out.println("--------------------------");
        System.out.println("1 - Calculate the total capacity and carrying capacity of all the aircraft in the airline.");
        System.out.println("2 - Display the list of aircraft of the company sorted by flight range.");
        System.out.println("3 - Find airplanes corresponding to a given range of fuel consumption parameters.");
        System.out.println("4 - Quit");
        System.out.println("--------------------------\n");

        try{
            selection = input.nextInt();
        }
        catch (Exception e){
            System.out.println("Wrong input.");
        }

        return selection;
    }
}
