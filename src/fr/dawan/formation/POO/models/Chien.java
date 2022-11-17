package fr.dawan.formation.POO.models;

import fr.dawan.formation.POO.interfaces.EstDomestique;

public class Chien extends Animal implements EstDomestique {
    
    @Override
    public void crier() {
        System.out.println("wouaff wouaff");
        
    }
    @Override
    public void demanderDesCaresses() {
        System.out.println("carresse moi humain");
    }
    
    @Override
    public void jouerALaBalle() {
        System.out.println("baballe");
    }

}
