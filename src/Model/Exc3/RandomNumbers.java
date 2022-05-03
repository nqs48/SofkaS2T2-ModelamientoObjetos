package Model.Exc3;

import java.text.DecimalFormat;

/**
 * @author Nestor Quiroga
 * Class RandomNumbers
 */
public class RandomNumbers {
    /**
     *
     */
    private double[] numbers;

    /**
     *
     */
    public RandomNumbers() {
    }

    /**
     *
     * @param cat
     */
    public void setNumbers(int cat) {
        this.numbers = new double[cat];
    }

    /**
     *
     * @return
     */
    public double[] getNumbers() {
        return numbers;
    }

    /**
     *
     * @return
     */
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

    /**
     *
     * @param list
     * @param low
     * @param high
     */
    public void quickSort(double[] list,int low,int high){
        int i,j;
        double ref,t;
        if(low>high){ return; }
        i=low;
        j=high;
        ref = list[low];
        while (i<j) {
            while (ref<=list[j]&&i<j) { j--; }
            while (ref>=list[i]&&i<j) { i++; }
            if (i<j) {
                t = list[j];
                list[j] = list[i];
                list[i] = t;
            }
        }
        list[low] = list[i];
        list[i] = ref;
        quickSort(list, low, j-1);
        quickSort(list, j+1, high);
    }

    /**
     *
     */
    public void randomGenerator(){
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (double) (Math.random() * (100 - (-100)) + (-100));
        }
    }

    /**
     *
     * @param list
     * @param df
     * @param s
     */
    public void viewList(double[] list, DecimalFormat df, String s){
        System.out.println("\n--------"+ s +"--------");
        for (double v : list) {
            System.out.println("\t\t\t"+df.format(v));
        }
        System.out.println("-----------------------------\n");
    }

}
