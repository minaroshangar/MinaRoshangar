package com.syntax.class06;

import java.util.Scanner;

public class SwitchWithString {
public static void main(String[] args) {
	Scanner scan;
	String country, food;
	
	scan=new Scanner(System.in);
	System.out.println("please enter your country");
	country=scan.next();
	switch (country.toLowerCase()) {// converting it to lowercase
	case "usa":
	food="burger";
	break;
	case "afghanistan":
		food="kabab";
		break;
	case "mexico":
		food="Tacos";
		break;
		default:
			food="unknown";
			break;
	}
	System.out.println("ur favorite food is "+food);
}
}
