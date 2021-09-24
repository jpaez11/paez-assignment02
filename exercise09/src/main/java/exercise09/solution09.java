/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jorge Paez
 *
 * Pseudocode:
 * Making a program that will output how much paint is needed to cover a room in square feet.
 * By calculating the area, using the input that users provide.
 */
package exercise09;
import java.util.*;

public class solution09 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in); //creating the scanner obj
        final double sqFtperG = 350;

        System.out.print("Enter length: ");
        double length = sc.nextDouble(); //allows user to enter length

        System.out.print("Enter width: ");
        double width = sc.nextDouble(); //allows user to enter width

        double allSq = length*width; //total square

        int gal = (int)Math.ceil(allSq/sqFtperG); //gallons

        System.out.println("You will need to purchase " +gal+ " of paint to cover " + allSq + " square feet." );
    }
}
