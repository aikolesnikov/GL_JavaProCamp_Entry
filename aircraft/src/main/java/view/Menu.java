package view;

import java.util.Scanner;

public class Menu {
    static public int initMenu(){
        int selection;
        Scanner input = new Scanner(System.in);

        System.out.println("Choose from these choices:");
        System.out.println("-------------------------\n");
        System.out.println("1 - Enter an original number");
        System.out.println("2 - Encrypt a number");
        System.out.println("3 - Decrypt a number");
        System.out.println("4 - Quit");
        System.out.println("-------------------------\n");

        selection = input.nextInt();
        return selection;
    }
}
