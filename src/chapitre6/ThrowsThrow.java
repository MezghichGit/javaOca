/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapitre6;

import java.io.IOException;

/**
 *
 * @author amine
 */
public class ThrowsThrow {

    /**
     * @param args the command line arguments
     */
    public static void info() throws ArithmeticException,NullPointerException //Unchecked Exception
    {
        System.out.println("OK");
        throw new ArithmeticException();
        //System.out.println("OK");
    }
    
    public static void info2() throws RuntimeException //Unchecked Exception
    {
        System.out.println("OK");
        throw new ArithmeticException();
        //System.out.println("OK");
    }
    public static void affichage() throws Exception //Checked Exception
    {
        //System.out.println("OK");
        throw new Exception();
    }
    
    public static void affichage2() throws IOException //Checked Exception
    {
        System.out.println("OK");
    }
    
    public static void main(String[] args) {
        /*
        info();
        info2();*/
        try{
        affichage();
        }
        catch(Exception e){}
        //affichage2();
    }
    
}
