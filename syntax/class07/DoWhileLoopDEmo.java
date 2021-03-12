package com.syntax.class07;

public class DoWhileLoopDEmo {
	public static void main(String[] args) {
		System.out.println("--while loop-----");
		int num = 1;
		while (num <= 5) {
			System.out.println(num);
			num++;
		}
		System.out.println("--Do while loop-----");

		int num1 = 1;
		do {
			System.out.println(num1);
			num1++;
		} while (num1 <= 5);
	}
}
