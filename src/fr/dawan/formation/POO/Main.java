package fr.dawan.formation.POO;

import java.util.ArrayList;
import java.util.List;

import fr.dawan.formation.POO.interfaces.EstDomestique;
import fr.dawan.formation.POO.models.Animal;
import fr.dawan.formation.POO.models.Chat;
import fr.dawan.formation.POO.models.Chien;
import fr.dawan.formation.POO.models.Felin;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
    Chien chien= new Chien ();
    chien.setName("medor");
     
    Chat chat = new Chat ("Cactus", "tabby", 10);
    
    System.out.println(chat.getName()); 
    chat.manger();
    
    Felin felin =new Felin("jean michel", "roux", 103);
    
    felin.crier();
    chien.demanderDesCaresses();
    chat.demanderCroquettes();
    
    
    System.out.println(Animal.getCount());
    System.out.println(Chat.getCount());
    System.out.println(Felin.getCount());
    chat.switchPelage();
    
    //polymorphisme
    
    Animal cat1 =new Chat();
    Animal felin1 = new Felin ();
    
    System.out.println(cat1.getPelage()); // fourrure
    System.out.println(felin1.getPelage()); // fourrure
    cat1.crier(); //miaou
    
    // pas d'acces au attribut et au methode qui viennent de la classe animal
    List<Animal>mes_animaux = new ArrayList<>();
    
    mes_animaux.add(felin1);
    mes_animaux.add(cat1);
    mes_animaux.add(chien); // chien contenu dans la liste sera caster en animal
    
    EstDomestique chien2= new Chien ();
    EstDomestique chat2= new Chat ();
    
    chien2.demanderDesCaresses();
    chat2.jouerALaBalle();
    
    //mes_animaux.add(chien2); --> n'est pas un animal
    
    /* c'est le typage de la variable qui definit son type, et pas le constructeur utilisé. et les objets
     * sont des instances de leur classe, mais aussi des classe et interfaces dont ils heritent
     */
    // Chien chien = new Chien ();
    System.out.println("Chien est un animal " + (chien instanceof Animal));
    System.out.println("Chien est un chien " + (chien instanceof Chien));
    System.out.println("Chien estDomestique " + (chien instanceof EstDomestique));
    
    // EstDomestique chien2 = new Chien ();    
    
    System.out.println("chien2 est un animal " + (chien instanceof Animal));
    System.out.println("chien2 est un chien " + (chien instanceof Chien));
    System.out.println("chien2 estDomestique " + (chien instanceof EstDomestique));
    
    
    }

}
