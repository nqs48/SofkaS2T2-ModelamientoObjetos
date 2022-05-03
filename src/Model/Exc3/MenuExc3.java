package Model.Exc3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Nestor Quiroga
 * Class MenuExc3 to show the menus
 */
public class MenuExc3 {

    /**
     * Prints the SORT ARRAY RANDOM Menu and receives the user's choice
     * @param separator String to formatted the information
     * @return User's choice, type int
     */
    public int printMainMenuEX3(String separator) {
        try {
            int user;
            System.out.println("\n\t\tSORT ARRAY RANDOM | MENU" + separator);
            System.out.println("| 1. Bubble sort: (1)");
            System.out.println("| 2. Quick sort: (2)");
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
