/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Statement;

/**
 *
 * @author amine
 */
public class NewMain {

    private int methode(final int x) {
        return 1;
    }

    enum Jours {

        LUNDI, MARDI, MERCREDI, JEUDI, VENDREDI, SAMEDI, DIMANCHE
    };

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Jours j = Jours.LUNDI;
        //System.out.println("J = " + j);
        /*
         int y = 10;
         System.out.println((y > 5) ? 21 : "Zebra");
         //int animal = (y < 91) ? 9 : "Horse";
         */
        // Les switch
        /*
         int s = 4;
         switch (s) {
         case 1:
         System.out.println("S1");
         break;
         case 2:
         System.out.println("S2");
         break;
         case 3:
         System.out.println("S3");
         break;
         default:
         System.out.println("Autre");
         }
         */
        /*
         Jours j = Jours.SAMEDI;
         switch (j) {
         case LUNDI:
         System.out.println("LUNDI");
         break;
         case MARDI:
         System.out.println("MARDI");
         break;
         case MERCREDI:
         System.out.println("MERCREDI");
         break;
         default:
         System.out.println("Autre");
         //break;
         }*/
        /*
         final int x = 10;
         //x = 11;  // x est final donc pas de changement de valeur
         System.out.println("Suite");
         */
        int x = 0;
        do {
            x++;
            System.out.println(x);
        } while (false);//while (x<10);

        int y = 0;
        while (y<10) {
            y++;
            System.out.println(y);
        }
        //System.out.println(x);
        
        byte x1 = 5;
        byte y1 = 10;
        double z = x1 + y1;
    }

}
