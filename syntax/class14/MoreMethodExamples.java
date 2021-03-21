package com.syntax.class14;

public class MoreMethodExamples {
	
	//create a method that doesnot take any values
	//and always return String Hi
	
	 String print() {
		 return "Hi";
	 }
	 
	 //create a method that takes a number and return the double of that number
	 
	 double doubleTheValue(double input) {
		 return input*2;
	 }
	 
	 //create a method that takes boolean as input, if value is true, I want to print take the umbrella
	 // and if value is false, I want to print please go for a walk
	 
	public void isRaining(boolean isRaining) {
		if(isRaining) {
			System.out.println("take umbrella");
		}else {}
		System.out.println("Please go for a walk");
	}
	
public static void main(String[] args) {
	
	MoreMethodExamples obj=new MoreMethodExamples();
	 System.out.println(obj.print());
	double result= obj.doubleTheValue(10);
	System.out.println(result);
	obj.isRaining(false);
	
}
}
