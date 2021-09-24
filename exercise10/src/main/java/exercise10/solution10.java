/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jorge Paez
 *
 * Pseudocode:
 * The program will price three items and their tax. The values will be inputted by the user.
 * The output will show the subtotal, the tax value, and the total price of all the items together.
 */

package exercise10;
import java.util.*;

public class solution10 {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the price of item 1: ");
        double price1 = s.nextDouble(); //take price of 1st item
        System.out.print("Enter the quantity of item 1: ");
        int item1 = s.nextInt(); //take quantity of first item

        System.out.print("Enter the price of item 2: ");
        double price2 = s.nextDouble(); //take price of 2nd item
        System.out.print("Enter the quantity of item 2: ");
        int item2 = s.nextInt(); //take quantity of 2nd item

        System.out.print("Enter the price of item 3: ");
        double price3 = s.nextDouble(); //take print of 3rd item
        System.out.print("Enter the quantity of item 3: ");
        int item3 = s.nextInt(); //take quantity of 3rd item

        double result = (price1*item1)+(price2*item2)+(price3*item3); //calculate result
        double tax; //calculate tax
        tax = 5.5 * result /100;
        double total = result +tax; //calculate final total


        System.out.println("Subtotal: $"+ result ); //print output
        System.out.println("Tax: $"+tax);
        System.out.println("Total: $"+total);
    }
}
