package com.syntax.class14;

public class MethodClassTask {
//write a method that prints Batch9 is great

	void print() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Batch 9 is great");
		}
	}
	
	//create a method that takes 2 numbers and
	//return the gretest number
	int greaterNumber(int num1, int num2) {
		if(num1>num2) {
			return num1;
		}else {
			return num2;
		}
	}
	
	//create a method that takes a number,
	//if number is even print  number is even,
	//else number is odd
	
	void number(int number) {
		if(number%2==0) {
			System.out.println("number is even");
			
		}else {
			System.out.println("number is odd");
		}
	}
	//write a method that takes an array 
	//and return the sum of the elements that are present in the array
	
	double returnTheArraySum(double [] arr) {
		double sum=0;
		for(double element:arr) {
			sum=sum+element;
		}
		return sum;
	}

	public static void main(String[] args) {
		MethodClassTask obj = new MethodClassTask();
		obj.print();
		
		int great=obj.greaterNumber(100, 10);
		System.out.println(great+" is greater");
		
	obj.number(32);
	double [] arr= {10.2,5.4};
		System.out.println(obj.returnTheArraySum(arr));
	}
}
