package com.syntax.class03;

public class Casting {
public static void main(String[] args) {
	
	//widening and narrowing Casting, 
	//widening happens automatic and its called implicit
	//narrowing is explicit, and should happen manually
	
	int i=(int)10.99;//narrowing casting and happened explicitly
	
	double a=10;// this is widening casting and happens automatically
	
	byte b=(byte)130;
	System.out.println(b);
}
}
