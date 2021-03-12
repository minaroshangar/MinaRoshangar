package com.syntax.class11;

import java.util.Scanner;

public class EnhancedLoopTask {
	public static void main(String[] args) {
		// create an array of double values using scanner;
		// calculate the sum of all stored elements in that array
		double num;
		Scanner scan;
		double[] value;
		double sum = 0;
		scan = new Scanner(System.in);
		System.out.println("how many doble numbers yo would like to enter?");
		int size = scan.nextInt();

		value = new double[size];
		for (int i = 0; i < size; i++) {
			System.out.println("please enter number");
			value[i] = scan.nextInt();
			sum += value[i];

		}

		System.out.println("The sum of " + size + " elements from an array = " + sum);
		System.out.println("============using enhanced loop====================");
		sum = 0;
		for (double val : value) {
			sum += val;
		}
		System.out.println("sum  equals to " + sum);
	}
}
