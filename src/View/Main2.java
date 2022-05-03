package View;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Vector;

public class Main2 {
    public static void main(String[] args) {

        DecimalFormat df= new DecimalFormat("#.00");
        int n = 10;
        float[] numbers = new float[n];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = getRandomNumber(0, 100);
        }

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    float aux = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = aux;
                }
            }
        }


        for(int i = 0; i < numbers.length; i++) {
            System.out.println(df.format(numbers[i]));
        }
    }

    public static float getRandomNumber(float min, float max) {
        return (float) (Math.random() * (max - min) + min);
    }



}




