// *  UCF COP3330 Fall 2021 Assignment 2 Solution
// *  Copyright 2021 Jorge Paez
// *
// *
// * Pseudocode:
// * Making a program that calculates the area of a rectangular room.

package exercise07;
import java.util.*;

public class solution07 {
    public static void main(String [] args){
        Scanner ic = new Scanner (System.in); //creates scanner object

            System.out.println("What is the length of room in feet? ");
            double length =  ic.nextDouble(); //length in ft

            System.out.println("What is the width of room in feet?");
            double width = ic.nextDouble(); //width in ft

            double area = length * width;
            final double sqMeters = area * 0.09290304; //converting from ft to sq meters

            System.out.println("Area is: " + area + "ft"); //area in ft
            System.out.println("Area is: " + sqMeters + " square meters" ); //area in square meters
    }
}
