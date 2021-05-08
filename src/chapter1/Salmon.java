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
public class Salmon {

    int count;

    public void Salmon() { // une méthode
        count = 4;
    }
     public static void main(String[] args) {
     Salmon s = new Salmon();
     s.Salmon();
         System.out.println(s.count);
     }
    
}
