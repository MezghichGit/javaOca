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
public class NewMain {

    public static void info() throws IllegalArgumentException, NullPointerException {
        System.out.println("chapitre 4");
    }

    public static void main(String[] args) {
        info();
        Animal a = new Animal();
        a.name="toto";
        a.getName();
        a.espece="Chien";
        a.getEspece();
        Poisson p = new Poisson();
        p.espece="Dorade";
        a.id = 10;
    }

}
