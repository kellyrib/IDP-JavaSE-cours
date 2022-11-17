package fr.dawan.formation;

public class Numbers {

    public static void main(String[] args) {
        
        /*
         * Numbers :type primitif
         * nom :     type       taille        valeur        defaut
         * 
         * int      entier       32bytes       -2(31)à 2(31)      0
         * double   decimal      64 bytes      -4.9*10(324) à 1.7*10(308) 0.0d
         * float    decimal     32bytes     -1.4*10(-45) à3.5*10(38)       0.0f
         * long      entier    64bytes      -2(63) à 2(63)     0L
         * byte       entier   8bytes       -128 à 127         0  
         * short    entier     16bytes       -2(15) à 2(15)    0
         * 
         * 
         */
        byte by =125;
        byte by2=(byte) 129; //-127
        System.out.println(by2);
        
        by2=(byte) 130; //-126
        System.out.println(by2);
        
        int a=10;
        int b =by;// caste automatiquement de la valeur de by en integer
        
        System.out.println(b);//125
        
       // byte b3=b; // impossible mais on perd en préscision
        
        /* on peut caster sans soucis vers un tyope plus grand mais pas le contraire
         * on peut caster un entier en decimal
         * on dit que le castage est implicite
         */
        double db=b;
        System.out.println(db);
        
        float f=123.589f;
        //int c= f;
        //System.out.println(c); on peut le caster mais on perd en precision 
        
        
        /* operateurs de calculs
         * + addition
         * - soustraction
         * * multiplication
         * / division
         * % modulo
         * 
         *  le résultat de l'opération est considéré comme une valeur => on enregistre non pas l'opefration
         *   , on enregistre son résultat
         */
        
        
        System.out.println((1+1)); //2
        
        int d =321+12/78*3-1;
        System.out.println(d);// le résultat 320
        
        d=(1+1)*3; //6
        
        // les calculs fonctionnent comme sur une calculatrices, le meme ordre de pruiorités
        d=10;
        d=d+1;
        d++; // incrémentation
        d=d-1;
        d--; //décrementation
        
        d=d*1;
        d*=1;
        d+=1;
        d-=1;
        d/=1;
        d%=1;
        
        d=10;
        
        System.out.println(d++);// 10 affiche 10 et fait +1 apres
        
        System.out.println(d); // 
        
        
        System.out.println(++d); // 12 incremente d puis affiche
        
        double encoreUndouble= d+1.5;
        int encoreUnInt = (int) (d+1.5);
        
        /* on peut faire des opertayions entres les types cependant il cfaut caster le reseultat
         * vers le type le plus grand et le plus precis
         * 
         * dans ce cas il faudra caster explicitement et on prend le risque de perdre en precicion
         * 
         * voir au dessus
         */
        
        int z=3;
        int y=z;
        z=2;
        
        System.out.println(y); //3
    }

}
