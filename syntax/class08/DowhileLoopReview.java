package com.syntax.class08;

import java.util.Scanner;

public class DowhileLoopReview {
/*
 * we want to make user to pay for soda
 * keep asking user to pay you untill it enteres $3
 * 
 * if user gives more then 3--> please give less money
 * if user gives less then 3--> give more money
 */
	public static void main(String[] args) {
		
		
	Scanner input=new Scanner(System.in);
	int num;
	do {
		  System.out.println("Please pay $3 for the soda");
		num=input.nextInt();
		if (num<=3) {
			System.out.println("Please give more money");
		}else {
			System.out.println("Please give less");
			
		}
		
		}while(num != 3);
		
		System.out.println("It's ok");
		
		}
	
	}

