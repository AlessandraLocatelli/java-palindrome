package org.java.lessons;
import java.util.Scanner;

//programma che chiede all'utente di scrivere una parola e poi gli riferisce
//se è palindroma (es.otto,radar,esose) o meno
//bonus jsnack 8-jsnack9



public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //chiediamo all'utente di inserire una parola
        System.out.println("Inserisci una parola: ");
        String word = sc.nextLine();
        //creo una stringa vuota che conterrà la parola scritta
        //dall'utente letta al contrario
        String reversedWord = "";

        for (int i = word.length()-1; i >= 0; i--) {
            reversedWord += word.charAt(i);

        }

        if (word.equals(reversedWord))
        {
            System.out.println(word+" è una parola palindroma");
        }
        else
        {
            System.out.println(word+ " non è una parola palindroma");

        }

    }

}


