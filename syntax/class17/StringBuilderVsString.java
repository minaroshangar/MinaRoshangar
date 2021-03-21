package com.syntax.class17;

public class StringBuilderVsString {
public static void main(String[] args) {
	
	//in string clas if there is a duplicate, the memory will be scanned and 
	//if its available it will not make a new variable
	String var1="Meerim";
	String var2="Meerim";
	var2="Mina";
	
	
//but if we use string builder, nothing will be scanned in memory and new obj will be created inside the memory
	StringBuilder sb1=new StringBuilder();
	StringBuilder sb2=new StringBuilder("Meerim");
	System.out.println(sb1);
	System.out.println(sb2);
	System.out.println(sb1.reverse());
	
	//to reverse a sring we can not use string class so this is how we can do
	String var3="Ayob";
	StringBuilder sb3=new StringBuilder(var3);
	sb3.reverse();
	var3=sb3.toString();
	System.out.println(var3);
	
}
}
