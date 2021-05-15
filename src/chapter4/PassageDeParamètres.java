/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

/**
 *
 * @author amine
 */
public class PassageDeParamètres {

    public static void permut(int a, int b) // a et b sont les paramètres formels
    {
        System.out.println("a = " + a + " b = " + b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + " b = " + b);
    }

      public static void modifSB(StringBuilder sb) { // sb : paramètre formel
        sb.append("-ocp");
    }
      
     public static void modifS(String st) { // st : paramètre formel
        st.concat("-ocp");
    }
    public static void main(String[] args) {
        String s = new String("oca"); // s : paramètre effectif
        modifS(s);
        System.out.println("s = "+s);
        /*
         int x = 1, y = -1;
         permut(x, y); // x et y sont les paramètres effectives
         System.out.println("x = "+x+" y = "+y);
         */
        /*StringBuilder s = new StringBuilder("oca"); // s : paramètre effectif
        modifSB(s);
        System.out.println("s = "+s);*/
    }

}
