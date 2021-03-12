package com.syntax.class06;

import java.util.Scanner;

public class ExampleByTeacher {
	public static void main(String[] args) {
		double price, discount = 0, finalPrice = 0;
		String item;
		Scanner scan = new Scanner(System.in);
		System.out.println(" do we have any sale?");

		boolean sale = scan.nextBoolean();
		if (!sale) {
			System.out.println(" no shopping");
		} else {
			System.out.println(" do u have an item?");
			item = scan.next();
			System.out.println("whats the price?");
			price = scan.nextDouble();

			if (price > 0 && price < 10) {
				discount = price * 0.05;

			} else if (price >= 10 && price < 100) {
				discount = price * 0.1;

			} else if (price >= 100 && price <= 500) {
				discount = price * 0.2;

			} else if (price > 500) {
				discount = price * 0.3;

			}
			finalPrice = price - discount;
			System.out.println("you are buying " + item + " with original price=$ " + price + " after discount "
					+ discount + " your final price is = " + finalPrice);
			if(finalPrice<500) {
				System.out.println("i didint do crazy shopping");
			}else {
				System.out.println("i did crazy shopping");
			}
		}
	}
}
