/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1;

/*import chapter2.Chien;
import chapter2.Oiseau;
import chapter2.Poisson;*/
import chapter2.*;
import chapter2.chapter21.Canari;
import chapter3.*;


/**
 *
 * @author amine
 */
public class Animal {
String name;  // attribut d'instance cad Attribut d'un objet Animal
static int nb;  // attribut de la classe, cad accessible par le nom de la classe

public Animal() // constructeur par defaut
{
    System.out.println("Constructeur par défaut");
}

public Animal(int x, String a) // constructeur avec paramètres
{
    System.out.println("Constructeur avec paramètres");
}
public static void info()
{
    System.out.println(nb);
    //System.out.println(name);
}
public  void affichage()
{
    System.out.println(nb);
    System.out.println(name);
}

// bloc d'initialisation d'instance
{
    System.out.println("Bloc d'instance");
    /*int x = 20;
    System.out.println(x);
    System.out.println(name);*/
}

// bloc d'initialisation de classe
static {
    System.out.println("Bloc statique");
}
/*
   public void infoOiseau(chapter3.Oiseau o) {
    }

    public void infoPoisson(Poisson p) {
    }
    
    public void infoChien(Chien c) {
    }
    
    public void infoChat(Chat ca) {
    }
    
     public void infoCanari(Canari n) {
    }
    
     public void infoPersonne(Personne p) {
    }
     public void infoVoiture(Voiture v) {
    }
    */ 
}
