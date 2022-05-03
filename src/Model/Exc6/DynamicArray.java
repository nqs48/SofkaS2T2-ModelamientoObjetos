package Model.Exc6;

import java.util.Scanner;
import java.util.Vector;

public class DynamicArray {

    private final Vector<Integer> array;

    public DynamicArray() {
        this.array = new Vector<>(2,1);
    }

    public Vector<Integer> validation(){
        Scanner user = new Scanner(System.in);
        System.out.println("\nEnter a number: ");
        Integer n1User = user.nextInt();
        System.out.println("\nEnter a number: ");
        Integer n2User = user.nextInt();
        this.array.addElement(n1User);
        this.array.addElement(n2User);
        while (!array.lastElement().equals(array.get(array.size() - 2))){
            Scanner userA= new Scanner(System.in);
            System.out.println("\nEnter a number");
            int userNum= userA.nextInt();
            array.addElement(userNum);
        };
        return array;
    }

    public void printArray(Vector<Integer> array){
        System.out.println("\n\n------------- Your numbers -------------");
        array.forEach((Integer)-> System.out.print("\t"+Integer));
        System.out.println("\n----------------------------------------\n\n");
    }

}
