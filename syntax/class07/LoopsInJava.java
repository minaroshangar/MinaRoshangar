package com.syntax.class07;

public class LoopsInJava {
	public static void main(String[] args) {

		// while loop will print just when the condition is true
		System.out.println("--------while loop--------");
		int time = 7;
		while (time < 12) {
			System.out.println("hello");
			time++;
		}

		// print numbers from1-10
		int num = 1;
		while (num < 11) {
			System.out.print(num + " ");
			num++;
		}
		// print numbers from 20-40
		int num1 = 20;
		while (num1 < 41) {
			System.out.print(num1 + " ");
			num1++;

		}
		
		int a=10;
		while(a<1) {
			System.out.print(a+" ");
			a--;
		}

	}
}
