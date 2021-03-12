package com.syntax.class08;

import java.util.Scanner;

public class Classtask3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a start rang");
		int start = scan.nextInt();
		System.out.println("please enter the end rang");
		int end = scan.nextInt();
		int even = 0;
		int odd = 0;
		if(start<end) {
		for (int i = start; i <= end; i++) {
			
			if (i % 2 == 0) {
				even += i;
			} else {
				odd += i;
			}
		}
		System.out.println("Sum of odd numbers from range "+start+" to "+end+" equal to " + odd);
		System.out.println("Sum of even numbers from range "+ start+" to "+end+" equal to " + even);
		}

	}
}
/*
 * Write a program that reads a range of integers (start and end point),
 * provided by a user and then from that range prints the sum of the even and
 * odd integers.
 */
