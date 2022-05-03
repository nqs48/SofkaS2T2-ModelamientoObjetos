package Model.Exc1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Nestor Quiroga
 * Class MenuExc1 to show the menus
 */
public class MenuExc1 {

    /**
     * Prints the PLANETARY SYSTEM: OMEGA 557 Menu and receives the user's choice
     * @param separator String to formatted the information
     * @return User's choice, type int
     */
    public int printMainMenuEX1(String separator) {
        try {
            int user;
            System.out.println("\n\t\tPLANETARY SYSTEM: OMEGA 557 | MENU" + separator);
            System.out.println("| 1. Create Celestial Body: (1)");
            System.out.println("| 2. View Celestial Bodies: (2)");
            System.out.println("| 3. Gravitational force between bodies OMEGA 557 : (3)");
            System.out.println("| 4. Calculator Gravitational Force: (4)");
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
     * Prints the VIEW CELESTIAL BODIES  subMenu and receives the user's choice
     * @param separator String to formatted the information
     * @return User's choice, type int
     */
    public int viewCelestialBody(String separator){
        try{
            int user;
            System.out.println("\n\n\t\tVIEW CELESTIAL BODIES | SUBMENU"+separator);
            System.out.println("| 1. View Planets: (1)");
            System.out.println("| 2. View Stars: (2)");
            System.out.println("| 3. View Asteroids: (3)");
            System.out.println("| 4. View Suns: (4)");
            System.out.println("| 5. View Moons: (5)");
            System.out.println("| 6. View all Celestial Bodies: (6)");
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
     * Prints the CREATE CELESTIAL BODY subMenu and receives the user's choice
     * @param separator String to formatted the information
     * @return User's choice, type int
     */
    public int createCelestialBody(String separator){
        try{
            int user;
            System.out.println("\n\n\t\tCREATE CELESTIAL BODY | SUBMENU"+separator);
            System.out.println("| 1. Create Planet: (1)");
            System.out.println("| 2. Create Star: (2)");
            System.out.println("| 3. Create Asteroid: (3)");
            System.out.println("| 4. Create Sun: (4)");
            System.out.println("| 5. Create Moon: (5)");
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
