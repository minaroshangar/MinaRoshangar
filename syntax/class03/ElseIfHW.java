package com.syntax.class03;

public class ElseIfHW {
public static void main(String[] args) {
	
	//Write a program to check whether number is positive or negative.
	int num=-12;
	
	if(num<0) {
System.out.println(num +" is negative");
	}else if(num>0) {
		System.out.println(num+" is positive");
	}else {
		System.out.println(num+" is zero");
	}
	System.out.println("-----------------");
	//Write a Java Program to check whether number is Even or Odd.
	int num1=0;
	if(num1%2==0) {
		System.out.println(num1+" is even");
	}else if(num1%2!=0) {
		System.out.println(num1+" is odd");
	}else {
		System.out.println(num1+" is nutural");
	}
}
}
