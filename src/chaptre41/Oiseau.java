/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chaptre41;

import chapter4.Animal;

/**
 *
 * @author amine
 */
public class Oiseau extends Animal{
   void getInfo()
   {
       System.out.println(this.espece);
       this.getEspece();
       this.id =  20;
   }
}
