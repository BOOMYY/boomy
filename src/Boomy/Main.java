/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boomy;

import java.util.Scanner;

/**
 *
 * @author laganjv
 */
public class Main {

    public static void main(String[] args) {

        Animal[] animalArray = new Animal[4];
//        temp[0] = new Animal();
//        temp[0].setKind("dog");
//
//        temp[1] = new Animal();
//        temp[1].setKind("cat");
//
//        System.out.println("0: " + temp[0].getKind());
//        System.out.println("1: " + temp[1].getKind());

        Scanner input = new Scanner(System.in);
        for (int counter = 0; counter < animalArray.length; counter++) {
            animalArray[counter] = new Animal();
            System.out.println("input Animal");
            String inputAnimal = input.nextLine();
            animalArray[counter].setKind(inputAnimal);
        }
        for ( Animal anim : animalArray){
            System.out.println("animal: " + anim.getKind());
        }

    }

}
