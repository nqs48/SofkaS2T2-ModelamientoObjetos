package Model.Exc6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuExc6 {

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
