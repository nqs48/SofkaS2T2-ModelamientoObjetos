package Model.Exc2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Nestor Quiroga
 * Class MenuExc2 to show the menus
 */
public class MenuExc2 {

    /**
     * Prints the CONCURRENT MAIN CLASSES Menu and receives the user's choice
     * @param separator String to formatted the information
     * @return User's choice, type int
     */
    public int printMainMenuEX2(String separator) {
        try {
            int user;
            System.out.println("\n\t\tCONCURRENT MAIN CLASSES | MENU" + separator);
            System.out.println("| 1. Set Main Class Config: (1)");
            System.out.println("| 2. Create Artifact .JAR: (2)");
            System.out.println("| 3. RETURN MAIN MENU: (3)" + separator);
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
