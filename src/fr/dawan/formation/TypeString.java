package fr.dawan.formation;

import java.util.Scanner;

public class TypeString {

    public static void main(String[] args) {
        /* les caracteres : type primitif
         * type char
         *      - 16 bits
         *      - accepte   
         *              -1 caractere
         *              - caractere hexadecimal ou unicode
         *      -valeur par defaut 'a'
         *      
         */
        
        char a ='a'; // on utilise des simples cotes
        System.out.println(a);
        
        a = 0x00061; // 'a' en hexadecimal
        a= '\u0061'; // 'a' en unicode
        
        System.out.println(a); //a
        a++;
        System.out.println(a);//b;
        
        // caractere d'echappement 
        /*
         * certains caractere servent à passer des instructions particuliere au compiler 
         * ces caracteres sont ^recedes d'un backslash \ qui sert a les echapper
         * echapper : modifier son sens classique
         */
        
        char quote = '\''; // le caractere '
        
        String guillemet ="\""; // le caractere "
        char backslash= '\\'; // le caractere \
        
        char esc ='n'; //caractere n
        
        esc ='\n'; //saut de ligne
        
        /* 
         * \n new line
         * \t tabulation ...
         */
        
        // String  
        /*
         * chaine de caractere
         * 
         */
        
        String name ="jane doe";
        String greetings ="bonjour";
        
        // concaténation 
        
        System.out.println(greetings +" "+ name);
        // 3 string collés
        int age= 121;
    System.out.println(name + " a" + age + " ans ");
    
    // le caste d'un int vers une string est implicite
    
    // int nope =(int) name;
    // on ne peut pas caster une string en int
    
    // String est une classe 
    
    /* elle  nous offre differentes methode :
     * 
     *
     */
    System.out.println(name.toUpperCase()); // majuscule
    System.out.println(name.toLowerCase()); // minuscule
    System.out.println(name.length()); //longueur
    System.out.println(name.equals(greetings)); // true ou false,  est egale ?
    System.out.println(name.compareTo("Jane Doe !"));// -2 , name a 2 caractere differents
    System.out.println(name.compareToIgnoreCase(("jane doe")));// 0
    
    String[]splitted = name.split(""); // ["Jane", "Doe"]
    splitted = name.split(" "); // coupe caractere par caractere
    String sub= name.substring(5);// va chercher , a partir de 5 tout le reste d ela chaine
    System.out.println(sub);// doe
    
    System.out.println(name.charAt(0)); // "j"
    
    System.out.println(name.indexOf("e")); // var chercher l'index du 1er e trouvé
    
    //https://www.w3schools.com/java/java_ref_string.asp
    Scanner scan = new Scanner(System.in);
    
    System.out.println("ntrez votre prenom");
    String firstName=scan.next();
    String lastName=scan.next();
    System.out.println("bonjour" + firstName + " | " + lastName);
    System.out.println( "entrez votre prenom : (again)");
    String username=scan.nextLine();
    
    System.out.println( "vous etes " + username);
    System.out.println("age?");
    int userage= scan.nextInt();
    System.out.println("vous avez "+ userage);
    }
    
  

}
 