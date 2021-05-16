/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4.LexpressionLambda;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 *
 * @author amine
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Avant Java 8
        Voiture v = new Voiture();
        v.info();

        // A partir de la version Java 8
        /*
         Vehicule v1 = ()->{return;};
         Vehicule v2 = ()->{System.out.println("Une implémentation");};
         Vehicule v3 = ()->{System.out.println("Une autre implémentation");};
         v1.info();
         v2.info();
         v3.info();*/
        //Correction ex
        
         IString imp1 = (String a, String b)->{return a.startsWith(b);};
         imp1.info2();
         IString.info();
         IString imp2 = (String a, String b)->{return a.contains(b);}; // EXPRESSION COMPLETE
         IString imp3 = (a,b)-> a.contains(b); // EXPRESSION REDUITE
         System.out.println(imp1.op("ProgrammerI", "Pr"));
         System.out.println(imp2.op("ProgrammerI", "gr"));
        
         System.out.println(imp1.op("ProgrammerI", "vr"));
         System.out.println(imp2.op("ProgrammerI", "RG"));
        //l'interface prédéfinie Predicate
        Predicate<String> p = (String s) -> {
            return s.length() < 4;
        };
        //System.out.println(p.test("oca")); // false
        //System.out.println(p.test("programmer I")); // true
        
        ArrayList<String> ls = new ArrayList<>();
        ls.add("oca");
        ls.add("ocp");
        ls.add("programmer I");
        ls.add("programmer II");
        System.out.println(ls);
        ls.removeIf(p);
        System.out.println(ls);
    }

}
