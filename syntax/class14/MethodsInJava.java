package com.syntax.class14;

public class MethodsInJava {
public static void main(String[] args) {
	
	int num1=10;
	int num2=3;
	int num3=45;
	checkNumbers(num1);
	checkNumbers(num2);
	checkNumbers(num3);
	
	
}

public static void checkNumbers(int num) {
	if(num>0) {
		System.out.println(num +" is greater then 0");
	}else if(num<0) {
		System.out.println(num+" is less then 0");
	}else {
		System.out.println(num+" is 0");
	}
}
}
