package org.java.lessons;

//Calcola la somma e la media dei primi 10 numeri.

public class BonusJSnack9 {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;


        for(int i= 0; i< numbers.length; i++)
        {
            sum += numbers[i];

        }

        double average = (double)sum / (double)numbers.length;

        System.out.println("La somma dei numeri è: "+sum);
        System.out.println("La media dei numeri è "+average);






    }


}
