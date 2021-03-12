package com.syntax.class02;

public class VariableDecleration {
public static void main(String[] args) {
	//first way declare the variable and then initialize it
	int a=30;
	
	//2nd way, declare, the later initialize
	int sum;//declaration happens just once
	sum=12;// initializing the variable
	sum=2; // reassigning the value
	
	//3rd way if we know all variables are same type, we can put them  in one line
	int x,y,z;
	x=1;
	y=2;
	z=11;
	//using the value of variable to initialize different variable
	int num=10;
	int num2=num;
	System.out.println(num);
	
}
}
