/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.LesCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author amine
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         ArrayList l = new ArrayList();  //tablau dynamique
         //System.out.println(l.size());
         //System.out.println(l.isEmpty());
         System.out.println(l.add("oca"));
         System.out.println(l.add("ocp"));
         System.out.println(l.add("test"));
        
         System.out.println(l);
         System.out.println(l.contains("ocp-"));
         //System.out.println(l.remove(0));
         //System.out.println(l.remove("oca"));
         System.out.println(l);
         System.out.println(l.size());
         System.out.println(l.isEmpty());
         */

        /*List l1 = new ArrayList();
        
         l1 = new LinkedList();
         ArrayList l2 = new ArrayList();
       
         //l2 = new LinkedList();
        
         //List l2 = new LinkedList();*/
        /*
         ArrayList<String> l = new ArrayList<>();
         l.add("oca");
         l.add("true");
         l.add("a");
         l.add("12");
         l.add("18.5");
         for(Object o : l)
         {
         String temp = (String)o;
         System.out.println(temp.length());
         }
         System.out.println(l);
         */
        /*
         ArrayList<Animal> l = new ArrayList<>();
         l.add(new Animal("Chien",2));
         l.add(new Animal("Chat",3));
         System.out.println(l);
         List L2=new ArrayList();
         */
        /*
         ArrayList<Integer> li = new ArrayList();
         li.add(16);
         li.add(new Integer(14));
         li.add(new Integer(8));
         System.out.println(li);  //avant tri
         Collections.sort(li);
         System.out.println(li); // après le tri
         System.out.println(Collections.binarySearch(li, 8));
         */
        // passage d'un tableau vers la liste
        String tab[] = {"oca", "ocp", "spring"};

        List<String> l = Arrays.asList(tab);
        System.out.println(l);
        //l.add("java");
        l.set(0, "Programmer I");
        System.out.println(tab[0]);
        // passage d'une liste vers un tableau
        /*
        List<String> ls = new ArrayList<>();
        ls.add("oca");
        ls.add("ocp");
        Object t[] = ls.toArray();
        System.out.println(t.length);
        System.out.println(t[0]);
        System.out.println(t[1]);
        */
    }

}
