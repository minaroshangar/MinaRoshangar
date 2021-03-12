package com.syntax.class06;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * find largest number among 3 numbers using nested if provided by user
 * numbers must be distinct
 */
		int num1, num2, num3;
		Scanner input=new Scanner(System.in);
		String largest=null;
		
		System.out.println("Please enter three number");
		num1=input.nextInt();
		num2=input.nextInt();
		num3=input.nextInt();
		if(num1==num2&& num2==num3) {
			System.out.println("numbers are equal");
		}else {
			if (num1>num2) {
			    if (num1>num3) {
					largest="number 1";
				} else {
					largest="number3";
				}
			} else {
				    if (num2>num3) {
				     largest="number 2";
		           } else  {
		    	     largest="number3";
		    }
		}
	System.out.println("the largest number among "+num1+","+num2+","+num3+", is "+largest);
		}
		
	}
}
