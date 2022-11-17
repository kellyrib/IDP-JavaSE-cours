package fr.dawan.formation;

public class Methode {

    
    public static void main(String [] args) {
        
        multiply(1);
        multiply(12,25,26,14,15);
        
    }
    // public : portée de la méthode (défault protected)
    // int : type de retour, si pas de retour void
    public int sum(int a, int b) {
        return a+b;
    }
    
    public void sayHello() {
        System.out.println("hello world!!!!!!!!!");
    }
     public boolean checkSomething( int truc) {
         if(truc<0) {
             System.out.println("nombre invalide");
             return false;
         }
         return true;
     }
     
     public static int multiply(int ... values) { // on met autant de parametre que l'on veut
         // values est un tableau de int
         return 0;
     }
}
