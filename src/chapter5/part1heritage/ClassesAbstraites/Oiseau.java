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
public class Oiseau extends Animal {
   
    @Override
    public void seDeplacer()
   {
       System.out.println("Je nage pour me déplacer");
   } 
    
    public void info(){}
}
