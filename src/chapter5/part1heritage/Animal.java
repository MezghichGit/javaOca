/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5.part1heritage;

/**
 *
 * @author amine
 */
public class Animal {
   private String pays="Tunisie";
   int age = 1;
   protected String nom="toto";
   public double poids=3.5;
   
   public void affichage(){
       System.out.println("Un Animal");
   }
   /*public Animal() //constructeur sans paramètres explicite
   {
       System.out.println("const Animal");
   }*/
   public Animal(boolean carnivore)
   {
       System.out.println("const Animal avec param boolean");
   }
}
