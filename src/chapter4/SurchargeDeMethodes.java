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
public class SurchargeDeMethodes {

//    public  void somme(int a, int b) {
//        System.out.println("int a, int b");
//    }
     public  void somme(short a, short b) {
        System.out.println("int a, int b");
    }
    public  void somme(long a, long b) {
        System.out.println("double a, double b");
    }
   public  void somme(Integer a, Integer b) {
        System.out.println("Integer a, Integer b");
    }
    public void somme(int... s) {
        System.out.println("int ... s");
    }
    public static void main(String[] args) {
        SurchargeDeMethodes s = new  SurchargeDeMethodes();
        //s.somme(10,4.5);
        s.somme(10,4);
    }
}
