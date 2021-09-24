/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jorge Paez
 *
 *
 * Pseudocode:
 * Making a program that serves the purpose of a retirement calculator and tells the current year.
 */
package exercise06;
import java.text.SimpleDateFormat;
import java.util.*;

public class solution06 {
    public static void main (String [] args){
        Scanner in  = new Scanner(System.in); //making scanner object
        int recentYear = Calendar.getInstance().get(Calendar.YEAR);

        Date currentDate = new Date(); //asks java for the date
        System.out.println(currentDate);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy"); //current year
        System.out.println(dateFormat.format(currentDate));

        System.out.print("What is your age?"); //asks user for age
        int age = in.nextInt();//user input

        System.out.print("What age do you wish to retire?");
        int retirement = in.nextInt(); //retirement input

        int retireYear = retirement - age; //retirement calc
        System.out.println("You have " + retireYear + " year(s) until you can retire."); //print retire years

        retireYear = recentYear + retireYear; //years left
        System.out.println("It's " + recentYear + " you can retire in " + retireYear); //prints years left

    }
}
