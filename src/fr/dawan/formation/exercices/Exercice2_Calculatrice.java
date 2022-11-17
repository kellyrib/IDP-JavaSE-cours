package fr.dawan.formation.exercices;

import java.util.Scanner;

public class Exercice2_Calculatrice {

    /*
     * 1. Calculatrice ---------------
     * 
     * Demander à user de rentrer un calcul -> nombre_A opérateur nombre_B
     * 
     * => Retourner le résultat du calcul en fonction de l'opérateur.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean rejouer = true;

        do {
            System.out.println("veuillez entrez un calcul :");
            int a = Integer.parseInt(scan.next());
            String operateur = scan.next();
            int b = Integer.parseInt(scan.next());
            int result = 0;
            String nomOp = "";

            switch (operateur) {
            case "+":
                result = a + b;
                nomOp = "addition";

                break;
            case "-":
                result = a - b;
                nomOp = "soustraction";
                break;
            case "*":
                result = a * b;
                nomOp = "multiplication";
                break;
            case "/":
                result = a / b;
                nomOp = "division";
                break;
            case "%":
                result = a % b;
                nomOp = "modulo";
                break;

            default:
                break;
            }
            System.out.println("le resultat de votre " + nomOp + " entre " + a + " et " + b + " est de : " + result);
            System.out.println("voulez vous rejouer ? O/N");
            char reponse = scan.next().charAt(0);
            if (reponse == 'O') {
                rejouer = true;

            } else if (reponse == 'N') {
                rejouer = false;
                System.out.println("vous avez terminer de jouer");
                break;
            }
        } while (rejouer = true);

    }

}
