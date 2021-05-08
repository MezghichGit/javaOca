/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1;

/**
 *
 * @author amine
 */
public class Poisson {
   int couleur;
   double taille;
   boolean issaumon;
   
   public void finalize(){
       System.out.println("Destruction de l'objet");
   }
}
