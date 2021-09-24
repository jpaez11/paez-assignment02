/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jorge Paez
 *
 * Pseudocode:
 * Making a program that will exchange euros into dollars. By calculating the exchange rate
 * between dollars and euros.
 */

package exercise11;
import java.util.*;

class moneyExchange{ //class to exchange the currencies
    double euro;
    double rate;
    public void read(){
        System.out.print("How many euros are being exchanged?");
        Scanner s = new Scanner(System.in); //object created
        this.euro = s.nextDouble(); //euro exchange
        System.out.print("What's the exchange rate?");
        this.rate = s.nextDouble(); //exchange rate
    }
    public void print(){
        System.out.println(euro + " euros at an exchange rate of " + rate + " is ");
        double conversion = euro*rate;
        System.out.printf("%.2f U.S dollars." , conversion); //shows conversion to $$
    }
}

public class solution11 {
    public static void main(String [] args){
        moneyExchange ma = new moneyExchange(); //reads the class made
        ma.read();
        ma.print();
    }
}
