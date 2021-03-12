package com.syntax.class03;

public class CompoundOperator{

	public static void main(String[] args) {
		int num=100;
		num=num+100;
		System.out.println(num);
		
		num=num-50;
		System.out.println(num);
		System.out.println("----compound operators------");
		//now using compound operator
		int num1=100;
		num1+=100;
		System.out.println(num1);
		
		num1-=50;
		System.out.println(num1);
		num1/=5;
		System.out.println(num1);
		num1*=10;
		System.out.println(num1);
	}

}
