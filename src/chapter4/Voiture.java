/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

/**
 *
 * @author amine
 */
public class Voiture {
//  Voiture v2 = new Voiture("Audi", "A6");
    public Voiture() {
        System.out.println("Une voiture");
    }
    public Voiture(String modele) {
        this(); // appel au constructeur par défaut :  chainage de constructeur
        System.out.println("Modele = " + modele);
    }
    public Voiture(String modele, String marque) {
        this(modele); // appel au constructeur avec 1 paramètre
        System.out.println("Modele = " + modele + " Marque= "+marque);
    }
}
