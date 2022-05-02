package Model.Exc4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuExc4 {

    public int printMainMenuEX4(String separator) {
        try {
            int user;
            System.out.println("\n\t\tFERRY CONTROL | MENU" + separator);
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

}
