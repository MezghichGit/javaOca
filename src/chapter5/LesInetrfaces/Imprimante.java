/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5.LesInetrfaces;

/**
 *
 * @author amine
 */
public abstract interface Imprimante {
   public static final int dureeVie = 10; 
   String marque ="HP";  // par defaut public static final
   
   //public void imprimer();
   public abstract void imprimer();
   
   public  default void impressionLaser(){
       System.out.println("impression...Laser");
   }
   
    public static void impressionJet(){
       System.out.println("impression...Jet");
   }
    
    public  default void info(){
       System.out.println("info Imprimante");
   }
    
}
