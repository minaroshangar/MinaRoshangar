package com.syntax.class07;

import java.util.Scanner;

public class LottryWithWhileLoop {
public static void main(String[] args) {
	
	Scanner scan=new Scanner (System.in);
	int num;
	int lotteryNumber=17;
	System.out.println("please enter number from 1-100 to win lottery");
	num=scan.nextInt();
	
	while(num!=lotteryNumber) {
		System.out.println("please enter number from 1-100 to win lottery");
		num=scan.nextInt();
	}
	System.out.println("Congratulatio  you entered "+ num+" which is lucky number");
}
}
