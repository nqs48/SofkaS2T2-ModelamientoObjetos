package Model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

    /**
     * Menu to choose if init with preloaded data or not.
     * @param separator String with characters for separate lines in the menu
     * @return returns the value corresponding to the option
     */
    public int printPreloadMenu(String separator){
        try{
            int user;
            System.out.println("\n\tPOO: OBJECTS MODELING | PRELOAD DATA"+separator);
            System.out.println("> Do you want preload data to: \n\n\tPLANETARY SYSTEM and FERRY CONTROL: Vehicles types ?\n");
            System.out.println("| 1. Yes: (1)");
            System.out.println("| 2. No: (2)");
            System.out.println("\nEnter the number of your process:"+separator);
            Scanner inputPreload = new Scanner(System.in);
            user=inputPreload.nextInt();
            return user;
        }catch (InputMismatchException e ){
            System.out.println("\n\tIncorrect selection data!!\n\nError: "+e);
            return 0;
        }


    }


    public int printMainMenu(String separator) {
        try {
            int user;
            System.out.println("\n\t\tPOO: OBJECTS MODELING | MAIN MENU" + separator);
            System.out.println("| 1. Planetary System: (1)");
            System.out.println("| 2. Concurrent main classes: (2)");
            System.out.println("| 3. Sort Array Random: (3)");
            System.out.println("| 4. Ferry Control: (4)");
            System.out.println("| 5. Ferry Control: Vehicles types : (5)");
            System.out.println("| 6. Vector: Dynamic Array: (6)");
            System.out.println("| 7. EXIT APP: (7)" + separator);
            System.out.println("Enter the number of your process:");
            Scanner inputMain = new Scanner(System.in);
            user = inputMain.nextInt();
            return user;
        } catch (InputMismatchException e) {
            System.out.println("\n\tIncorrect selection data, try again.\n\nError: \n" + e);
            return 0;
        }
    }

}
