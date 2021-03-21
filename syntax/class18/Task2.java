package com.syntax.class18;

public class Task2 {
	
public static String reverseName(String str) {
	String str2="";	
	
	for(int i=str.length()-1;i>=0;i--) {
		str2+=str.charAt(i);
	}
	return str2;
}
	

public static void main(String[] args) {
	String print=Task2.reverseName("mina");
	System.out.println(print);
}
}
/*
 * Create a method that will take a String as a parameter and returns reversed String.
 *  Method should be available to all classes within your project and accessible by class name.
 * 
 */
