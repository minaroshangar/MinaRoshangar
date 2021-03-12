package com.syntax.class08;

import java.util.Scanner;

public class whileLoopReview {

		/*
		 * we want to make user to pay for soda
		 * keep asking user to pay you untill it enteres $3
		 * 
		 * if user gives more then 3--> please give less money
		 * if user gives less then 3--> give more money
		 */
			public static void main(String[] args) {
				
				
			Scanner input=new Scanner(System.in);
			int money;
			System.out.println("please pay for your soda");
			money=input.nextInt();
			
			while(money!=3) {
				if (money<3) {
					System.out.println("give more money");
					}else if(money>3) {
						System.out.println("pay less money");
					}
				money=input.nextInt();
				}
			System.out.println("yhank yo for your purchase");
				}
			}

