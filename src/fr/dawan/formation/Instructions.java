package fr.dawan.formation;

import java.util.Iterator;

public class Instructions {

    public static void main(String[] args) {
        // les conditions

        int a = 10;

        if (a > 50) {
            System.out.println("c'est un grand nombre");
        } else if (a == 50) {
            System.out.println("c'est un nombre moyen");
        } else if (a < 50 && a >= 0) {
            System.out.println("c'est un petit nombre");
        } else {
            System.out.println("c'est plus petit que 0");
        }

        // switch

        String day = "lundi";

        switch (day) {
        case "lundi":
            System.out.println("oh no!");

            break;
        case "mardi":
        case "mercredi":
            System.out.println(" demain est un autre jour");
            break;
        case "jeudi":
            System.out.println("*dead*");
        case "vendredi":
            System.out.println("almost the end");

        default:
            System.out.println("week end!");
            break;
        }

        // ternaire : retourne 2 valeurs possibles en fonction d'un condition
        // WTF What ? True or False

        int age = 30;
        String ternaire = (true) ? "valeur si true " : "valeur si false";

        String message = (age > 140) ? "vous etes vachement vieille" : "ca passe!";

        // les boucles

        for (int i = 1; i < 10; i++) {
            System.out.println(i);
            if (1 == 3) {
                break;// arrete la boucle
                // continue; --> saute le nombre 3

            }
        }

        System.out.println("-------------------------------------\n");

        FIRST_LOOP:

        for (int i = 0; i < 5; i++) {
            System.out.println("\u001B[34m First Boucle : " + i + "\u001B[0m");
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    break FIRST_LOOP; // stop la boucle i
                }
                System.out.println("I: " + i + "--J : " + j);

            }

        }

        // while
        int l = 0;
        while (l > 0) {
            System.out.println(("--while: " + l));
            l--;
        
        }
        do {
            System.out.println(("--while: " + l));
            l++;
        }while(l<5);
        
        
        
        

    }

}
