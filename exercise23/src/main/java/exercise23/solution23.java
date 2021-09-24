/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jorge Paez
 *
 * Psuedocode:
 * Making a problem to tell car problems. This will be done using a ridiculous amount of if/else
 * statements. Every yes or no will prompt a different question.
 *
 */

package exercise23;
import java.util.*;

public class solution23 {
    public static void main(String []args){
        char selection;
        Scanner sc = new Scanner(System.in); //user input

        System.out.print("Is the car silent when you turn the key? ");
        selection = sc.next().charAt(0);

        if (selection == 'y') { //beginning the if/else statements that prompt selctions
            System.out.print("Are the Battery terminals corroded? ");
            selection = sc.next().charAt(0);

            if (selection == 'y') //for yes
                System.out.println("Battery may not be clean.Clean the terminals and try starting again.");
            else //no prompts the next question
                System.out.println("The battery cables may be damaged. Replace cables and try again.");

        } else { //no
            System.out.print("Does the car make a slicking noise? ");
            selection = sc.next().charAt(0);

            if (selection == 'y') //yes to above question
                System.out.println("Battery may be damaged.Replace the Battery.");

            else { //yes to above question (if 2)
                System.out.print("Does the car crank up but fail to start? ");
                selection = sc.next().charAt(0);

                if (selection == 'y') //yes, pt3
                    System.out.println("Spark plug connection may be loose.Check spark plug connection.");

                else { //no, (if3)
                    System.out.print("Does the engine start and then die? ");
                    selection = sc.next().charAt(0);

                    if (selection == 'y') { //yes, pt4
                        System.out.println("Does your car have fuel injection? ");
                        selection = sc.next().charAt(0);

                        if (selection== 'y') //yes, pt5
                            System.out.println("Get in it for service.");

                        else //no, pt5
                            System.out.println("Check to ensure the choke is opening and closing.");

                    } else { //last possible output
                        System.out.println("This should not be possible.");

                    }

                }

            }

        }


    }

}

