package com.syntax.class07;

public class WhileLoopDemo {
public static void main(String[] args) {
	System.out.println("----print numbers from 1-100-----------");
	int a=1;
	while(a<=100) {
		System.out.print(a+" ,");
		a++;
	}
	System.out.println("----------printing from 100-1----------");
	System.out.println();
	int m=100;
	while(m<=1) {
		System.out.print(m+" ,");
		m--;
	}
	System.out.println();
	System.out.println("---printing from 20-100-----------");
	int k=20;
	while(k<=100) {
		System.out.print(k+" ;");
		k--;
	}
}
}
