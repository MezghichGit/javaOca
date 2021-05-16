/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5.part1heritage.ClassesAbstraites;

/**
 *
 * @author amine
 */
public abstract class Animal {
   String espece;
   int age;
   double poids;
   
   public void manger()
   {
       System.out.println("Je dois manger pour grandir");
   }
   public abstract void seDeplacer();
   
}
