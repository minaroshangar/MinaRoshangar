package com.syntax.class08;

import java.util.Scanner;

public class ClassTask2 {
public static void main(String[] args) {
	boolean creditCard;
	Scanner scan=new Scanner (System.in);
	System.out.println("do u wanna apply for credit card?");
	creditCard=scan.nextBoolean();
	
	while(!creditCard) {
		System.out.println("do u wanna apply for credit card?");
		creditCard=scan.nextBoolean();
			
	}
		System.out.println("thank you for applying for credit card");
	


/*
 * Create a program that will keep asking user to apply for a credit card.
 *  As soon you get “yes” from a user program should stop asking.
 */
		System.out.println("-------------------------anotherway-----------------");
  String answer;

do {
  	 System.out.println("Please apply for a credit card");
  	 answer=scan.nextLine(); }
while (!answer.equalsIgnoreCase("yes"));
		System.out.println("Okay, no more question");
		
}}
