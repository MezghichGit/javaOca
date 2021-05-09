/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.chaineDeCaractères;

/**
 *
 * @author amine
 */
public class LesStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         String ch1 = "oca";  // pool
         String ch2 = new String("oca"); // heap
         String ch3 = "oca";  // pool
        
         /** équalité des adresses mémoires **/

        //System.out.println(ch1 == ch2);
        //System.out.println(ch1 == ch3);
        /**
         * équalité aux niveaux contenus *
         */
        //System.out.println(ch1.equals(ch2));
        /*
         String ch1 = "oca";
         System.out.println(ch1.concat("ocp")); //ocaocp
         System.out.println(ch1); //oca
        
         String ch2 = "oca";
         ch2 = ch2.concat("ocp"); //
         System.out.println(ch2);  //
         */
        /**
         * les méthodes de la classe String *
         */
        String ch = "animalsmassma";
        String ch1 = "Animals";
        //System.out.println(ch.length());
        //System.out.println(ch.charAt(3));
        //System.out.println(ch.indexOf("mal",3));
        //System.out.println(ch.indexOf('w')); // -1
        //System.out.println(ch.toUpperCase());
        //System.out.println(ch1.toLowerCase());
        //System.out.println(ch1.equals(ch));
        //System.out.println(ch1.equalsIgnoreCase(ch));
        //System.out.println(ch.replace("ma", "MA"));
        //System.out.println(ch.substring(2));
        //System.out.println(ch.substring(2,5));
        /*String s = "\t oc a ";
         System.out.println("s ="+s);
         System.out.println("s ="+s.trim());*/

        // La classe StringBuilder
        String s = "oca";
        StringBuilder sb = new StringBuilder(10);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        /*
         StringBuilder sb = new StringBuilder(s);
         System.out.println(sb);
         sb.append("ocpocpocpocpocpocp"); //ocaocp
         System.out.println(sb);
         System.out.println(sb.length());
         System.out.println(sb.capacity());*/

        /*StringBuilder sb1 = new StringBuilder("oca");
        String ch2 = sb1.toString();
        StringBuffer sf = new StringBuffer();
        sf.append("oca");
        System.out.println(sf.capacity());
        System.out.println(sf);*/
        int k = 2;
        String o = "oca"+2;
        //String o1 = k+2;  // NOT OK
        //String o1 = "oca"+2+3;
        String o1 = 2+3+"oca";
        System.out.println("o1 = "+o1);
    }

}
