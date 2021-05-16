/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4.LexpressionLambda;

/**
 *
 * @author amine
 */

@FunctionalInterface
public interface Vehicule {
    public void info();  // une méthode abstraite
    
    public static void info2(){}
    public default void info3(){}
}
