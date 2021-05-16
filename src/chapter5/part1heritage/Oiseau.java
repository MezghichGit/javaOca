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
public class Oiseau extends Animal{
    int age = 2;
    public Oiseau(){
        //super(); // appel au constructeur par défaut de la classe mère
        super(false);
        System.out.println("const Oiseau");
    }
    public void info()
    {
     System.out.println(this.age +" "+super.age + " "+super.nom+" "+super.poids);
    }
    
    public void affichage(){
       super.affichage();
       System.out.println("Oiseau");
   }
}
