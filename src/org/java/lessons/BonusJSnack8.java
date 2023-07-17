package org.java.lessons;
import java.util.Scanner;


//Chiedi un numero di 4 cifre all’utente
// e calcola la somma di tutte le cifre che compongono il numero.
public class BonusJSnack8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci un numero di quattro cifre: ");
        int num = sc.nextInt();
        int sum = 0;


        while (num > 0)
        {
        sum += num % 10;
        num = num /10;

        }

        System.out.println("La somma dei numeri è "+sum);




    }


}

