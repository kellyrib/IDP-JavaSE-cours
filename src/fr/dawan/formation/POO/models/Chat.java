package fr.dawan.formation.POO.models;

import fr.dawan.formation.POO.interfaces.EstDomestique;

public class Chat extends Felin implements EstDomestique {
    
    private static int count=0;

    
    public Chat() {
        count++;
    }

    public Chat(String name, String color, int age) {
        super(name, color, age);
        count++;
    }
    
    @Override
    public void crier() {
        System.out.println("miaou");
    }
    
    public void demanderCroquettes() {
        System.out.println("nourris moi humaine!");
    }
    
    @Override
    public void demanderDesCaresses() {
        System.out.println("carresse moi humain");
    }
    
    @Override
    public void jouerALaBalle() {
        System.out.println("baballe");
    }

    public static int getCount() {
        return count;
    }

   
    
    
    
}
