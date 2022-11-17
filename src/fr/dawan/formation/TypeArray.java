package fr.dawan.formation;

public class TypeArray {

    public static void main(String[] args) {
       
        double[]tab =new double [3];
        System.out.println(tab[0]); // les valeurs sont initialisées par defaut
        
        /* Initilaisation par defaut :
         * double 0.0
         * int 0
         * char \u0000
         * boolean false
         * reference null
         */

        tab[0]=1.5;
        
        for (int i = 0; i < tab.length; i++) {
            System.out.println("tab de " + i + " = " +tab[i]);
        }
        
        for(double el : tab) {
            System.out.println( "foreach : "+el);
            el++; // ne modifie pas le tableau , el est une variable locale
        }
        
        int entiers[]= {1,2,3};
        
        // meme chose que int[] entiers
        
       // System.out.println(entiers[3]); => souleve une exception of range
        
        int tablo [][]= new int [3][3]; // un tableau de 3 lignes contenant chacune un tableau de 3 zeros
        
        int tablooo[][]=    {{1,2,3},  // index 0
                            {4},  //  index1
                            {5,6},// index2
                            {7,8,9,10}}; // index 3
        
        
        int cinq = tablooo[2][0];
        int sept = tablooo[3][0];
        
    for (int[] subtablo:tablooo) {
        for (int value : subtablo){
            System.out.println(value);
            }
        }
    
    }

}
