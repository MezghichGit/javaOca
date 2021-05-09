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
public class LabelBreakContinue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         for(int i = 0; i <10;i++)
         {
         //if(i==5) break;
         if(i==5) continue;
         System.out.println(i);
         }*/

        boucle : for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    //break boucle;
                    continue boucle;
                }
                System.out.println(i+","+j);
            }
        }
        System.out.println("Fin du programme");
    }

}
