package com.syntax.class08;

import java.util.Scanner;

public class ClassTask4 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	String item;
	int price;
	int money;
	int total;
	int remainder;
	int sum=0;
	
	System.out.println("What do you want to buy?");
	item = input.nextLine();
	System.out.println("What is price?");
	price = input.nextInt();
	
	System.out.println("please give me money for "+item);
	price=input.nextInt();
	do {
		System.out.println("please give me money for "+item);
		money=input.nextInt();
		sum+=money;
		if(sum<price) {
			sum+=money;
			remainder=price-sum;
			System.out.println("please give "+remainder);
			
		}else if(sum>price) {
			remainder=money-sum;
			System.out.println("here is ur change "+remainder);
			break;
		}else {
			System.out.println("u got the right amount");
		}
	}while(price!=sum);
	System.out.println("thank u for shopping");
}
}
/*
 * Write a program to ask a user to enter item they want to buy and the price of
 * that item. Every time user enters money, accumulate the amount and tell the
 * user how much is left to pay off. If user give more money program should
 * return a change. Whenever a user done with payments program should say “Thank
 * you for shopping!”
 */
