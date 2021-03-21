package com.syntax.class17;

public class InstanceVariable {
	
	//instance variables are outside {}
	int number=10;
	void printNumber() {
		System.out.println(number);
		String name="Ali";
	}
	
	void printNumber2() {
		System.out.println(number);
	//	System.out.println(name); // CE we cannot access cuz its out of block. we ca access them by calling them inside main method
	}
public static void main(String[] args) {
	InstanceVariable obj=new InstanceVariable();
	System.out.println(obj.number);
	
}
}
