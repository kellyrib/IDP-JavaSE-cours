package fr.dawan.formation.POO.models;

import fr.dawan.formation.POO.Enum.Peau;

public class Felin extends Animal {

    private Boolean sociable;
    private Boolean hasGriffesRetractiles;

    public Felin() {

    }

    public Felin(String name, String color, int age) {
        super(name, color, age);
        this.setPelage(Peau.FOURRURE);
       
    }

    public Felin(String name, String color, int age, boolean sociable, boolean hasGriffesRetractiles) {
        super(name, color, age);
        this.sociable = sociable;
        this.hasGriffesRetractiles = hasGriffesRetractiles;
        this.setPelage(Peau.FOURRURE);

    }

    public Felin(int nbLegs, int age, String color, String name, Boolean sociable, Boolean hasGriffesRetractiles) {
        super(nbLegs, age, color, name);
        this.sociable = sociable;
        this.hasGriffesRetractiles = hasGriffesRetractiles;
        this.setPelage(Peau.FOURRURE);
    }
    
    @Override
    public void crier() {
        System.out.println("graou graou");
    }
    
    

}
