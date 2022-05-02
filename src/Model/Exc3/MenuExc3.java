package Model.Exc3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuExc3 {

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
