package com.syntax.class14;

import java.util.Scanner;

public class Example {
	
public static void main(String[] args) {
	 
	String Reverse="" ;
	Scanner word = new Scanner(System.in);
	System.out.println("enter any word");
	 String Normal = word.nextLine();
	 
	
	 for (int x=Normal.length()-1; x>=0;  x--) {
		 Reverse = Reverse+ Normal.charAt(x);
		
		 Reverse=Reverse.replaceAll(" ", "");
		
	 }
	 
	 
	 Normal= Normal.replaceAll(" ", "");
//	 System.out.println(Normal);
//	 System.out.println(Reverse);
		
	 if ( Reverse.equalsIgnoreCase(Normal)) {
		 System.out.println("words are palindrome");
	 }else {
		 System.out.println("words are not palindrome");
	 }	


	}}


