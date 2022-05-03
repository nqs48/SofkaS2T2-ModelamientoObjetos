package Model.Exc6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Nestor Quiroga
 * Class MenuExc6 to show the menus
 */
public class MenuExc6 {

    /**
     * Prints the VECTOR: DYNAMIC ARRAY Menu and receives the user's choice
     * @param separator String to formatted the information
     * @return User's choice, type int
     */
    public int printMainMenuEX6(String separator) {
        try {
            int user;
            System.out.println("\n\t\tVECTOR: DYNAMIC ARRAY | MENU" + separator);
            System.out.println("| 1. Start Dynamic Array: (1)");
            System.out.println("| 2. RETURN MAIN MENU: (2)" + separator);
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
