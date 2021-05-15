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
public class Animal {

    private int age;
    String name; // default
    protected String espece;
    public int id;
    public void getId(){}
    private int getAge() {
        return this.age;
    }

    String getName() { // default
        return this.name;
    }
    protected String getEspece() { // protected
        return this.espece;
    }
}
