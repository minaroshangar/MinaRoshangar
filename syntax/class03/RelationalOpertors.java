package com.syntax.class03;

public class RelationalOpertors {
public static void main(String[] args) {
	
	int a=10;
	int b=7;
	
	System.out.println(a>b);
	System.out.println(a<b);
	System.out.println(a==b);
	System.out.println(a!=b);
	System.out.println("------------");
	
	boolean result=a>=b;
	boolean result1=a<=b;
	
	System.out.println(result);
	System.out.println(result1);
	System.out.println("-----------");
	
	int c=20;
	int d=29;
	System.out.println(c==d);//checking equality
	System.out.println(c=d);//assigning a value
	System.out.println("value of d is: "+d);
}
}
