/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.LesCollections;

/**
 *
 * @author amine
 */
public class Animal {
    String nom;

    @Override
    public String toString() {
        return "Animal{" + "nom=" + nom + ", age=" + age + '}';
    }

    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
    int age;
}
