package fr.dawan.formation.exercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercice4_TabDouble {

    /*
     * 4. Tableau à 2 dimensions -----------------------
     * 
     * A. Une variable classe, qui contient, pour chacun des éléves la liste des
     * notes
     * 
     * 
     * => Afficher la moyenne de chaque élève => Afficher la moyenne la + haute, la
     * moyenne la + basse => Calculer la moyenne de la classe complète.
     */
    
    public static void main(String[] args) {
        double moyenneEleves=0;
        int compteur=0;
        double moyenneClasse=0;
        
        List<List<Integer>>eleves = new ArrayList<>();
        List<Double>moyenne= new ArrayList<>();
        List<Integer> notesEleve1 = new ArrayList<>(Arrays.asList(10,15,14));
        List<Integer> notesEleve2 = new ArrayList<>(Arrays.asList(8,12,10));
        List<Integer> notesEleve3 = new ArrayList<>(Arrays.asList(10,11,19));
        
        eleves.add(notesEleve1);
        eleves.add(notesEleve2);
        eleves.add(notesEleve3);
        
        for(List<Integer> notesEleve : eleves) {
            moyenneEleves=moyenne(notesEleve);
            moyenne.add(moyenneEleves);
            compteur++;
            System.out.println("la moyenne de l'eleve "+ compteur + " est de :"  + ((double) Math.round(moyenneEleves*100)/100));
          
        }
     
                
        System.out.println("la moyenne de la classe est de : " + ((double) Math.round(moyenneClasse(moyenne)*100)/100));
        System.out.println("La moyenne la plus haute est: " + (double)Math.round(Collections.max(moyenne)*100)/100);
        System.out.println("La moyenne la plus basse est: " + (double)Math.round(Collections.min(moyenne)*100)/100);
    }
    
     static double moyenneEleves(List<Double>notes) {
         double somme=0;
         double moyenne = 0;
         
         for(Double note : notes) {
             somme+=note;         
             }
         return moyenne =somme/notes.size();         
         
        
     }
     static double moyenne(List<Integer>notes) {
         double somme=0;
         double moyenne = 0;
         
         for(Integer note : notes) {
             somme+=note;         
             }
         return moyenne =somme/notes.size();         
         
        
     }
     
     static double moyenneClasse( List<Double>moyenne) {
         double moyenneClasse=0;
         
         moyenneClasse=moyenneEleves(moyenne);
         
         return moyenneClasse;
         
         }

    
}
