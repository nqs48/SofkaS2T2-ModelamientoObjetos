package View;

import java.util.Scanner;
import java.util.Vector;

public class Main2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Vector<Integer> numbers = new Vector<>();


        int first = Integer.parseInt(in.nextLine());

         numbers.add(first);

        int second = Integer.parseInt(in.nextLine());
        numbers.add(second);

        while (numbers.lastElement() != numbers.get(numbers.size() - 2)) {
            int number = Integer.parseInt(in.nextLine());
            numbers.add(number);
        }

        for(int n: numbers) {
            System.out.println(n);
        }





    }








}
