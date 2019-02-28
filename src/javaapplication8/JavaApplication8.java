/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author Student
 */
public class JavaApplication8 {

    public static double power(double base, int exponent) {
        int total = 1;
        int counter = 1;
        if (counter == exponent) {
            counter++;

            return 2;
        
    }else{
            return base* power(base,exponent-1);
        }
      
    /**
     * @param args the command line arguments
     */

    }
    public static void main(String[] args) {
        int temp = (int) power(2,4);
        System.out.println(temp);

    }

    /**
     * This method adds two:
     *
     * @param x user input
     * @param y another get user input
     * @return sum X + Y
     */
    public static int bark(int x, int y) {
        return (x + y);
    }

}
