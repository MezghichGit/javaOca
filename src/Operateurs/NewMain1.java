/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operateurs;

/**
 *
 * @author amine
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         byte x = 2;
         byte y = 100;
         int som = x * y;
       
         short a = 10;
         short b = 15;
         int c = a+b;
         */
        /*
         int x = 10;
         //int z = --x;  // preDecrement
         int z = x--;    // postDecrement
         System.out.println("z = "+z);
         System.out.println("x = "+x);
         */
        /*
         System.out.println(Short.MAX_VALUE);
         short y = (short)1921222; // un nombre litéral donc il sera évaluer sur 32 bits (int)
         //short y = (short)32770;
         System.out.println(y);*/

        //Les opérateurs d'affectation composés
       /*
        int x = 10;
        int y = 3;
        ///y = y * x;
        //System.out.println(y);
        y *=x;   // componed assignment operator
        System.out.println(y);*/
        /*long x = 10;
        int y = 5;
        //y = y * x;
        y*=x; // un cast implicte du long vers le int
        System.out.println(y);*/
        
        // L'opérateur instanceof
        /*
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Oiseau o = new Oiseau();
        Personne p = new Personne();
        boolean res = a1 instanceof Animal;
        //boolean res = o instanceof Animal;
        //boolean res = a1 instanceof Oiseau;
        //boolean res = p instanceof Animal;  // erreur de compilation
        System.out.println("res : "+res);
        */
        Chat c = new Chat();
        
        boolean test = c instanceof IA;
        boolean test2 = c instanceof IC;
        System.out.println("test : "+test);
        System.out.println("test2 : "+test2);
    }

}
