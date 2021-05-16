/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5.Polymorphisme;

/**
 *
 * @author amine
 */
public class NewMain {

    public static void infoAnimal(Animal a) // cette méthode est polymorphe : polymorphisque générique
    {
    }

    public static void main(String[] args) {
        Animal tab[]={new Oiseau(), new Poisson(), new Chien()};
        infoAnimal(new Oiseau());
        infoAnimal(new Poisson());
        infoAnimal(new Chien());
        
        Animal a = new Animal();
        Oiseau o = new Oiseau();
       //a = o; //upCasting : OK

        Oiseau o1 = new Oiseau();
        a = o1; // upcasting
        o = (Oiseau) a; // downCasting + cast(Oiseau)  + upCasting avant : OK
        //o = a; // downCasting  : NOTOK
        System.out.println("Suite");
    }

}
