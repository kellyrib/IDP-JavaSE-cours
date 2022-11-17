package fr.dawan.formation.exercices;

import java.util.Arrays;
import java.util.Iterator;

public class Exercice3_TabSimple {

    /*
     * 3. Tableaux Simples : ---------------------
     * 
     * 
     * - Soit un tableau de notes A. Calculer la moyenne des notes
     * 
     * B. Attention, pour calculer la moyenne, les notes doivent être comprise 0 et
     * 20 -> Ne calculer la moyenne que des notes correctes.
     * 
     * 
     * C. Trouver la médiane.
     */
    public static void main(String[] args) {

        double[] tab = { 15, 7, 18, 9, 12, 20, 59 };
        double moyenne = 0;

        moyenne = somme(tab) / compteur(tab);
        System.out.println((double) Math.round(moyenne * 100) / 100);
        System.out.println( "la mediane est " +median(tab));

    }

     
    public static double median(double[] tab) {
             int indexMiddle = tab.length/2;
             
            
        Arrays.sort(tab);
             
             if (tab.length%2 !=0 ) {
                 System.out.println("position de la note" +indexMiddle ); 
                 return tab[indexMiddle ];
             } else {
                 System.out.println("position de la note" +indexMiddle ); 
                 return (tab[indexMiddle -1] + tab[indexMiddle ]) / 2.0;
             }
             
         }
    


    static double somme(double[] tab) {

        double somme = 0;
       

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] >= 0 && tab[i] <= 20) {
                somme += tab[i];
            }

        }
        return somme;
    }
    
    

    static int compteur(double[] tab) {
        int compteur = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] >= 0 && tab[i] <= 20) {
                compteur++;
            }
        }
        return compteur;
    }
    
    
      
    
    
    
    
    
    
    
    
    
    
}


