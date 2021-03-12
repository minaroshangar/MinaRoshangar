package com.syntax.class02;

public class StringExample {
public static void main(String[] args) {
	
	String name;
	name="Chris";
	
	String greeting="Good Morning";
	//concatenation
	// we will print hello, my name is Chris
	System.out.println("Hello, my name is "+name);
	
	//concatenating of int and STring can be stored in a String Value
	int day=7;
	String month="February";
	
	String date=day+" "+month;
	System.out.println(date);
}
}
