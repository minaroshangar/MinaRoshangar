package com.syntax.class08;

public class IfStatementHW {
	public static void main(String[] args) {
		// * calculate sum of odd and even numbers from 1 to 50 */
		int oddSum = 0;
		for (int a = 1; a < 50; a += 2) {
			oddSum = oddSum + a;
		}
		System.out.print(" The sum of odd number from 1 to 50 is " + oddSum);
		int evenSum = 0;
		for (int b = 2; b < 50; b += 2) {
			evenSum += b;
		}
		System.out.println();
		System.out.print(" From 1 to 50 Evennumber sum is " + evenSum);
		System.out.println("--another way--------");

		int odd = 0;
		int even = 0;

		for (int i = 0; i <= 50; i++) {
			if (i % 2 == 0) {
				even += i;
			} else {
				odd += i;
			}
		}

		System.out.println("Sum of odd numbers equal to " + odd);
		System.out.println("Sum of even numbers equal to " + even);
		System.out.println();
	}
}
