/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operateurs;

/**
 *
 * @author amine
 */
public class Chat implements IA,IC{
    public  void manger(){
        System.out.println("Le chat a faim");
    }
    
    public void mangerViande(){
         System.out.println("Le chat veut manger de la viande");
    }
}
