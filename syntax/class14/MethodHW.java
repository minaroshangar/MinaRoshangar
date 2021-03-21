package com.syntax.class14;


public class MethodHW {
	
public void sayHello(String country) {
	if(country.equals("kabul")) {
		System.out.println("Salam Khob Asti");
	}else if(country.equals("USA")) {
		System.out.println("Hi");
	}else if(country.equals("Egypt")) {
		System.out.println("Ahlan Sahlan");
	}else {
		System.out.println("unknown");
	}
}
public static void main(String[] args) {
	
	MethodHW obj=new MethodHW();
	obj.sayHello("Egypt");
}
}
/*
 * Create a method that will say Hello in different language
 *  based on the country that will passed when method is executed.
 * 
 */
