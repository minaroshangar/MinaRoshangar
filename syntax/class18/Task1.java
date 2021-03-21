package com.syntax.class18;

public class Task1 {
	
	
	 int sumArrayElement(int []arr) {
		 int sum=0;
		 for(int element:arr) {
			 sum+=element;
		 }
		return sum;
	}
	 public static void main(String[] args) {
		 Task1 obj=new Task1();
		 int [] arr= {10,20};
		System.out.println( obj.sumArrayElement(arr));
	}

}
/*
 * Create a method that will accept array as parameters and will return sum of all elements from array.
 *  Method should be visibly only within same package 
 *  and accessible by the creating an instance of the class.
 * 
 */
