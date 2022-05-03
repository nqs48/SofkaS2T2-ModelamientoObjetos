package Model.Exc3;

import java.awt.*;
import java.text.DecimalFormat;

public class RandomNumbers {
    private double[] numbers;

    public RandomNumbers() {
    }

    public void setNumbers(int cat) {
        this.numbers = new double[cat];
    }

    public double[] getNumbers() {
        return numbers;
    }


    public double[] subbleSort(){
        double[] list= numbers.clone();
        for(int i = 0; i < list.length; i++) {
            for(int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    double sen = list[i];
                    list[i] = list[j];
                    list[j] = sen;
                }
            }
        }
        return list;
    }

    public void randomGenerator(){
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (double) (Math.random() * (100 - (-100)) + (-100));
        }
    }

    public void viewList(double[] list, DecimalFormat df, String s){
        System.out.println("\n--------"+ s +"--------");
        for (double v : list) {
            System.out.println("\t\t\t"+df.format(v));
        }
        System.out.println("-------------------------\n");
    }

}
