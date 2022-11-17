package fr.dawan.formation.POO.models;

import fr.dawan.formation.POO.Enum.Peau;

abstract public class Animal {
    /*
     * POJO - plain old java object --> bonne pratique, convention d'écritude,
     * classe sans restriction java beans type de POJO-> classe,qui contient un
     * constructor, attribut en privé, getter/setter et serializable
     * 
     * public--> utilisable partout private --> utilisable dans la classe protected
     * --> utilisable dans le package
     */
    private int nbLegs, age;
    private String color, name;
    private Peau pelage;
    private static int count=0;
    
    public Animal() {
        count++;
    }

    public Animal(String name, String color, int age) {

        this.age = age;
        this.color = color;
        this.name = name;
        count++;
    }
    
    public Animal(int nbLegs, int age, String color, String name) {
        super();
        this.nbLegs = nbLegs;
        this.age = age;
        this.color = color;
        this.name = name;
        count++;
    }
    

    public void manger() {
        System.out.println(this.name + " dit miam miam");
    }
    
    public void switchPelage() {
        switch(this.pelage) {
        case FOURRURE : 
            System.out.println("perd des poils partout");
            break;
        case ECAILLE :
            System.out.println("pas agreables a caresser");
            break;
        case CARAPASSE:
            System.out.println("super dur");
            break;
        default:
            break;
        }
    }
    
    
    public abstract void crier() ;

    public int getNbLegs() {
        return nbLegs;
    }

    public void setNbLegs(int nbLegs) {
        this.nbLegs = nbLegs;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Peau getPelage() {
        return pelage;
    }

    public void setPelage(Peau pelage) {
        this.pelage = pelage;
    }

    public static int getCount() {
        return count;
    }

    
    
    
    

}
