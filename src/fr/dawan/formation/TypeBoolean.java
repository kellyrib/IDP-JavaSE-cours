package fr.dawan.formation;

public class TypeBoolean {

    public static void main(String[] args) {
        /* boolean : true or false
         * valeur binaire, qui ne peut avoir que 2 valeurs possibles vrai ou fauyx
         */ 
        boolean bool = true;
        /* operateurs conditionnels
         *  == egalité
         *  != diffrence
         *  < > superieur ou inferieur
         *  <= >= superieur ou egale / inferieur ou egale
         *  || ou
         *  && et
         *  
         *  ! non logique 
         */
        
        bool = !bool;
        bool = 4<10; // true
        bool =!(4<10); // false
        bool = 10==9 || 10<20;// true
        bool = 10==9 && 10<20; // false
        bool = true == !false; // true
        bool = true == !false && !true; // false
        System.out.println(bool);
        
        
        /*************************************************************/
        
        String a= "hello word";
        String b="hello ";
        b+= "world";
        
        System.out.println(a==b ); // false : verifie la memoire
        
        System.out.println(a.equals(b)); // true : verifie le contenu de la string

    }

}
