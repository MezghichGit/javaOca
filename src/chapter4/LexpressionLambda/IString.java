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
public interface IString {
    boolean op(String src, String temp);
    
    static void info(){
        System.out.println("interface IString");
    }
    
    default void info2(){
        System.out.println("interface IString");
    }
}
