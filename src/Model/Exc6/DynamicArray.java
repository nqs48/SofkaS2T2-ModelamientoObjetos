package Model.Exc6;

import java.util.Scanner;
import java.util.Vector;

/**
 * @author Nestor Quiroga
 * Class DynamicArray abstracts the functionality of a dynamic array
 */
public class DynamicArray {
    /**
     * array type Vector
     */
    private final Vector<Integer> array;

    /**
     * Constructor class DynamicArray, initialize the Vector with initial Capacity and Capacity Increment
     */
    public DynamicArray() {
        this.array = new Vector<>(2,1);
    }

    /**
     * Validation of the correct operation of the array (If the two last elements are repeated, the function ends)
     * @return returns the array with the current elements
     */
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

    /**
     * Prints the array formatted
     * @param array Array type Vector
     */
    public void printArray(Vector<Integer> array){
        System.out.println("\n\n------------- Your numbers -------------");
        array.forEach((Integer)-> System.out.print("\t"+Integer));
        System.out.println("\n----------------------------------------\n\n");
    }

}
