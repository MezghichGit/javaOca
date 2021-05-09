/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.lesTabelaux;

import java.util.Arrays;

/**
 *
 * @author amine
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void somme(int... t) // variable number of arguments
    {
        System.out.println(t.length);
    }

    public static void main(String[] args) {
        /*
         somme(10, 2);
         somme();
         somme(10);
         somme(new int[]{1,4,6,6,7});*/
        // Déclaration et initialisatiuon d'un tableau

        int[] t1 = {100, 10, 2, 4, -1};
        /*
         int t2[] = {10, 2, 4};
         System.out.println(t1.length);
         System.out.println(t2.length);
         int t3[] = new int[4];
         t3[0]=10;
         t3[1]=11;
         t3[2]=12;
         t3[3]=13;*/
        /*
        for (int i = 0; i < t1.length; i++) {
            System.out.print(t1[i] + " ");
        }
        System.out.println();
        
        Arrays.sort(t1);  // sort est une méthode de classe / TRI

        for (int i = 0; i < t1.length; i++) {
            System.out.print(t1[i] + " ");
        }
        System.out.println();
        */
        
        // Les tableaux à plusieurs dimensions(Cas de 2D)
        /*
        int tab [][];
        int [][] tab2;
        int [] tab3 [];
        
        tab = new int[2][3];
        tab[0][0]=10;
        tab[1][2]=10;
        
        tab2 = new int[3][];
        tab2[0]= new int[4];
        tab2[1]= new int[2];
        tab2[2]= new int[3];*/
        
        int t[][] = {{10,11},{20},{30,31,32,33,34}};
        /*
        for(int k =0; k<t.length; k++)
        {
            for(int j=0;j<t[k].length;j++)
            {
                System.out.print(t[k][j]+" ");
            }
             System.out.println();
        }*/
        
        for(int e[] : t)  // foreach loop
        {
            for(int i : e)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

}
