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
public class TestPoisson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ch = null;
        System.out.println(ch.length());
        Poisson p1 = new Poisson();
        Poisson p2 = new Poisson();
        Poisson p3 = new Poisson();
      
        p1 = p2;
        p3 = null;
        System.out.println("Debut...");
        System.gc();
         System.out.println("Fin...");
          for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
        System.out.println("Suite du programme...");
    }

}
