package com.syntax.classs12;

public class TaskSixGroupProject {
	public static void main(String[] args) {

		int num = -6;
		boolean prime = true;
		if (num > 1) {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					prime = false;
					break;
				}
			}
		} else {
			prime = false;
		}
		if (prime) {
			System.out.println(num + " is prime");
		} else {
			System.out.println(num + " is not prime number");
		}

	}
}
