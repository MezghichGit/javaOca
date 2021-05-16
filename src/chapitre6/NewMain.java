/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapitre6;

/**
 *
 * @author amine
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //ArithmeticException
       /*
         int x = 10;
         int y = 0;
         System.out.println("x/y = " + x / y);
         */

       // NullPointerException
        //String ch ="OCP";
        /*
         String ch =null;
         System.out.println(ch.length());*/
       //ArrayIndexOutOfBoundsException
       /*
         int tab[] = {12,3,4};
         System.out.println(tab[3]);*/
        //Les blocs try/catch/finally
        int x = 10;
        int y = 10;
        String ch = null;
        int tab[] = {12,3,4};
         
        try {
            System.out.println("x/y = " + x / y); // cette instruction est suceptible de générer une exception
            //System.out.println(ch.length());
            System.out.println(tab[3]);
        } catch (ArithmeticException e) {
            System.out.println("Oups! problème division par zéro");
            //System.out.println(e.getMessage());
            //e.printStackTrace();
            return; // provoque une sortie immédiate du main
        } catch (NullPointerException e) {
            System.out.println("Oups! Pointeur null");
            //System.out.println(e.getMessage());
            //e.printStackTrace();
            return; // provoque une sortie immédiate du main
        } catch (Exception e) {
            System.out.println("Oups!");

        } finally {  // ça permet de forcer l'exécution des instruction entre les {}
            System.out.println("Suite du programme...");
        }
    }

}
