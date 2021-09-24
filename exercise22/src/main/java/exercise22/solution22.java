/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jorge Paez
 *
 * Psuedocode:
 * Using an array and a loop, as well as a boolean statement, a program will compare
 * the smallest, biggest numbers. The user can also stop the loop.
 *
 */

package exercise22;
import java.util.*;


public class solution22 {
    public static boolean counter(int[] numbers, int x) { //the way that the numbers will be compared
        for (int num : numbers) //transferring numbers to num
            if (num == x)  //making number equal to x for the comparison in main class
                return true;
                 return false;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in); //user input
        int []num = new int[100]; //using array to compare the numbers
        int sum = 0;
        int biggest = 0;


        while (true) { //loop for number comparison
            System.out.print("Enter a number [to stop press -0] \n");
            int x = s.nextInt(); //user loop input

            if (x == -0)
                break; //stops the loop
        }
        System.out.println("The largest number is: "+ biggest);
    }
}
