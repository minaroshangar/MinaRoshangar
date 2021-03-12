package com.syntax.class02;

public class ConcatenationTask {
public static void main(String[] args) {
	String name="Maria";
	String lastName="Ali";
	String city="Chantilly";
	String state="VA";
	char grade='A';
	String phoneNumber="123-456-7878";
	String combined="My name is "+name+" my lastname is "+lastName+" I am an "+grade+" student "+ "I live in "+city+" "+state+" and my phone number is "+phoneNumber;
	
	System.out.println(combined);
	
	System.out.println("My name is "+name+" and I moved to new city (Fairfax) and new state CA. "+ " My new phone number is 123-333-5465.");
 
}
}
/*
In your program create different type of variables to store student’s information and then print value of those variables:
My name is ...name and my  last name is
I am A/B student 
I live in city and state
And my phone number is …..
b)   Change student’s city, state, phone number and grade. And print those updated values in the:
Example:
My name is __ and I moved to new city__ and new state__. My new phone number is ____
 */

