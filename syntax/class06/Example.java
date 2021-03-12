package com.syntax.class06;

import java.util.Scanner;

public class Example {
public static void main(String[] args) {
	/*
	 * we need to calculate final price after discount
	 * 
	 * we need to check if there is sale yes/No
	 * if no sale--> no shopping
	 * if there is Sale-->we will ask for items and the item price
	 * 
	 * 		if price is less the $10--> apply 5% discount
	 * 		if price is between 10 and 100--> apply 10% discount
	 * 		if 100-500--> apply 20% discount
	 * 		if more then 500--> apply 30%
	 * 
	 */
	Scanner scan;
	double finalPrice = 0,discount = 0,price;
	boolean sale=true;
	String item;
	
	scan=new Scanner(System.in);
	System.out.println(" Is there any sale?");
	sale=scan.nextBoolean();
	if(sale) {
		System.out.println("I am going for shopping");
		System.out.println("what item are you looking for?");
		item=scan.nextLine();
		System.out.println("how much is the price?");
		price=scan.nextDouble();
		if(price<10) {
			discount=price*0.05;
			finalPrice=price-discount;
		}else if(price>=10&& price<=100) {
				discount=price*0.10;
				finalPrice=price-discount;
		}else if(price>=100&& price<=500) {
			discount=price*0.20;
			finalPrice=price-discount;
		}else if(price>500) {
			discount=price*0.30;
			finalPrice=price-discount;
		}
		System.out.println(item+" which you purchase, its original price was "+price+" discount applied was "+discount+" ur final price is "+finalPrice);
	}else {
		System.out.println("not going for shopping");
	}
	
}
}
