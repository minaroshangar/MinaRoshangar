package com.syntax.class03;

import java.util.Scanner;

public class practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Scanner scan=new Scanner(System.in);
//System.out.println("please enter your name");
//String name=scan.nextLine();
//System.out.println("how old are you");
//int age=scan.nextInt();
//System.out.println("Hello your name is "+name+" and you are "+age+" years old");
System.out.println("-------------");
/*
 * if todays is Friday we will watch movie but would like to check the date
 * 
 * 			if date is 13 --> watching scary movie
 * 			and if it is not --> I will watch comedy, action
 * 
 * if no Friday --> I am studying
 */
boolean isFriday=true;
int date=13;

if(!isFriday) {
	System.out.println("we wil watch movie");
	if(date==13) {
		System.out.println("we will watch scary movie");
	}else {
		System.out.println("we will watch action movie");
	}
}else {
	System.out.println("I will study Java");
}
	}

}
