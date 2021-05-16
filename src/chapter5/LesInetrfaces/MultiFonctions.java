/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5.LesInetrfaces;

/**
 *
 * @author amine
 */
public class MultiFonctions implements Imprimante, Scanner, Photocopieuse {

    @Override
    public void imprimer() {
        System.out.println("Impression");
    }

    @Override
    public void scanner() {
        System.out.println("Scanner");
    }

    @Override
    public void photocopier() {
        System.out.println("photocopier");
    }

    @Override
    public void info() {
        System.out.println("info Multiphonctions");
    }
}
