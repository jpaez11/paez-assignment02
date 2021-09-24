/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jorge Paez
 *
 *
 * Pseudocode:
 * Making a program that divides slices of pizza between people, which tells the number of pizzas,
 * slices of pizza, and the amount of people. Shows the number of leftovers, if applicable.
 * Also shows the number of pizza each person should receive. By using if and else statements,
 * the program will tell if there are leftovers or not. 
 */
package exercise08;
import java.util.*;


public class solution08 {
    public static void main(String [] args){
        Scanner S = new Scanner(System.in);

        System.out.print("How many people are there?"); //the amount of people
        int ppl = S.nextInt();

        System.out.print("How much pizza is there?");
        int pizza = S.nextInt(); //this reads the amount of pizza

        System.out.print("How many slices of pizza?");
        int slice = S.nextInt(); //the amount of slices

        int complete = slice*pizza; //the total amount of food

        System.out.println(ppl+" people with "+pizza+" pizzas ("+complete+" slices)"); //the final display

         if (complete/ppl ==1){ //for single slices
             System.out.println("Enter person gets " + complete/ppl + " slices of pizza.");
         }

         else { //for plural slices left over
             System.out.println("Each person gets" + complete/ppl + "slices of pizza.");
             System.out.println("There are " + (complete%ppl) + "leftover pieces."); //does the math for slices if there is no leftovers
         }

    }
}
