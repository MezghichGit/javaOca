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
public class NewMain1 {
int age; // attribut d'instance(variable d'instance)
static int nb; // c'est une variable de classe
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Poisson p = new Poisson();
        System.out.println(p.couleur);
        System.out.println(p.taille);
        System.out.println(p.issaumon);
        /*int k ;   // variable locale
        //k++;
        System.out.println(k);*/
        /*byte x = -128;
        
        int val = 100_000_000;
        double moy = 1_2.5;
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);*/
        /*
        byte x = 0B11;   // nombre dans la base binaire
        byte y = 0X2F;   // nombre dans la base hexa
        
        byte z = 012;  // nombre dans la base octale
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("z = "+z);*/
        /*
        System.out.println(Long.MAX_VALUE);
        long val = 46_720_368_547L;
        byte x = 122;
        
        double moy = 12.5;  // 64 bits
        float m = 1.5F;   //64 bits
        */
        
    }
    
}
