package Model.Exc5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Nestor Quiroga
 * Class MenuExc5 to show the menus
 */
public class MenuExc5 {

    /**
     * Prints the CONCURRENT FERRY CONTROL: VEHICLES TYPE Menu and receives the user's choice
     * @param separator String to formatted the information
     * @return User's choice, type int
     */
    public int printMainMenuEX5(String separator) {
        try {
            int user;
            System.out.println("\n\t\tFERRY CONTROL: VEHICLES TYPE | MENU" + separator);
            System.out.println("| 1. Start Ferry: (1)");
            System.out.println("| 2. Register Vehicles: (2)");
            System.out.println("| 3. Verify Capacity : (3)");
            System.out.println("| 4. View Registered Vehicles: (4)");
            System.out.println("| 5. RETURN MAIN MENU: (5)" + separator);
            System.out.println("Enter the number of your process:");
            Scanner inputMain = new Scanner(System.in);
            user = inputMain.nextInt();
            return user;
        } catch (InputMismatchException e) {
            System.out.println("\n\tIncorrect selection data, try again.\n\nError: \n" + e);
            return 0;
        }
    }

    /**
     * Prints the VIEW REGISTERED VEHICLES subMenu and receives the user's choice
     * @param separator String to formatted the information
     * @return User's choice, type int
     */
    public int viewVehicles(String separator){
        try{
            int user;
            System.out.println("\n\n\t\tVIEW REGISTERED VEHICLES | SUBMENU"+separator);
            System.out.println("| 1. View Bicycles: (1)");
            System.out.println("| 2. View Boats: (2)");
            System.out.println("| 3. View Cars: (3)");
            System.out.println("| 4. View Motorcycles: (4)");
            System.out.println("| 5. View Trucks: (5)");
            System.out.println("| 6. View all Registered Vehicles: (6)");
            System.out.println("| 7. RETURN MENU: (7)"+separator);
            System.out.println("Enter the number of your process:");
            Scanner inputSongs = new Scanner(System.in);
            user= inputSongs.nextInt();
            return user;
        }catch (InputMismatchException e ){
            System.out.println("\n\tIncorrect selection data, try again.\n\nError: "+e);
            return 0;
        }
    }

    /**
     * Prints the REGISTER VEHICLES subMenu and receives the user's choice
     * @param separator String to formatted the information
     * @return User's choice, type int
     */
    public int createVehicle(String separator){
        try{
            int user;
            System.out.println("\n\n\t\tREGISTER VEHICLES | SUBMENU"+separator);
            System.out.println("| 1. Create Bicycle: (1)");
            System.out.println("| 2. Create Boat: (2)");
            System.out.println("| 3. Create Car: (3)");
            System.out.println("| 4. Create Motorcycle: (4)");
            System.out.println("| 5. Create Truck: (5)");
            System.out.println("| 6. RETURN MENU: (6)"+separator);
            System.out.println("Enter the number of your process:");
            Scanner inputSongs = new Scanner(System.in);
            user= inputSongs.nextInt();
            return user;
        }catch (InputMismatchException e ){
            System.out.println("\n\tIncorrect selection data, try again.\n\nError: "+e);
            return 0;
        }
    }




}
