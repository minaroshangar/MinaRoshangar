package com.syntax.class14;

public class Calculator {
	public static void main(String[] args) {
		
		Calculator obj=new Calculator();
	System.out.println(obj.add(12, 10));
	System.out.println(obj.sub(12, 10));
	System.out.println(obj.mult(12, 2));
	System.out.println(obj.div(15.2, 3.4));
	}

	int add(int num1, int num2) {
		return num1+num2;
	}
	
	double sub(double num1 ,double num2) {
		return num1-num2;
	}
	double mult(double num1, double num2) {
		return num1*num2;
	}
	double div(double num1, double num2) {
		if(num2!=0) {
			return num1/num2;
		}else {}
		return 0;
	}
}
