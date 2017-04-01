package com.company;
//set up user input ability
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {

    //define variables
	int num = 0;
	int reverse = 0;

	//prompt user
	Scanner scnr = new Scanner(System.in);
	System.out.println("Please enter a number:");
	num = scnr.nextInt();
    System.out.println("You entered the number: " + num);

        while(num != 0)
        {
            reverse = reverse * 10;
            reverse = reverse + num % 10;
            num = num/10;
        }

        System.out.println("The reverse of your number is: " + reverse);
    }
}
