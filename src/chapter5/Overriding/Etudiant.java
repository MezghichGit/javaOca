/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5.Overriding;

import java.io.IOException;

/**
 *
 * @author amine
 */
public class Etudiant extends Personne {

    @Override
     public  void info() throws Exception {
    }
     @Override
     protected Etudiant getPersonne() {
       return new Etudiant();
    }
}
