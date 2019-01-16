/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boomy;

/**
 *
 * @author laganjv
 */
public class Main {

    public static void main(String[] args) {
        Animal animalOne = new Animal();
        animalOne.kind = "sdsdf";
        animalOne.setSound("aw aww");
        System.out.println(animalOne.getSound());
        System.out.println(animalOne.kind);
        Animal animalTwo = new Animal("Henry", "meow meow");
        
        System.out.println(animalOne.kind);
        System.out.println();
//        System.out.println(animalOne.sayHello()); //error
//        
//        animalOne.sayHello();
//        System.out.println(animalOne.counter);
//        System.out.println(animalTwo.counter);

//        animalOne.weight = 1000000;
//        Animal.counter = 3000;
//
//        System.out.println(animalOne.counter);
//        System.out.println(animalTwo.counter);

    }

}
