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
public class VarArgs {

    static void calcul(int a,int ... t){
    System.out.println("Nbre de VarArgs : " + t.length);
    int som = 0;
    for(int k : t)
        //som = som +k;
        som+=k;
    
        System.out.println("La somme est = "+ som);
    }
    public static void main(String[] args) {
        calcul(1); //0
        calcul(10,4); // 14
        calcul(10,4,6,7,9); //36
    }
    
}
