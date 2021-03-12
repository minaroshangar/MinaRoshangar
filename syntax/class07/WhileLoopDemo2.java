package com.syntax.class07;

import java.util.Scanner;

public class WhileLoopDemo2 {
public static void main(String[] args) {
	
	int a=20;
	while(a<=100) {
		if(a%2==0) {
			System.out.println(a+" ");
		}
		a++;
	}
	// i want to capture name five time and say hello
	String name;
	Scanner scan=new Scanner(System.in);
	int num=5;
	while(num<=10) {
		System.out.println("please enter your name");
		 name=scan.nextLine();
		 System.out.println("Hello "+name);
		 num++;
	}
	
	

	
	
}
}
