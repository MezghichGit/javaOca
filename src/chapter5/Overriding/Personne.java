/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5.Overriding;

/**
 *
 * @author amine
 */
public class Personne {

    protected void info() throws Exception{
    }
    
    protected Personne getPersonne() {
        return new Personne();
    }
}
