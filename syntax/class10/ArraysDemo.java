package com.syntax.class10;

public class ArraysDemo {
public static void main(String[] args) {
	
	
	int num=10; num=20;
	System.out.println(num);
	
	int [] array=new int [5];
	array [0]=10;
	array [1]=12;
	array [2]=15;
	array [3]=9;
	array [4]=13;
	System.out.println(array[0]+array[4]);
	
	double [] numbers=new double[2];
	numbers[0]=10.99;
	numbers[1]=19.01;
	// reassigning
	numbers[0]=11.99;
	System.out.println(numbers[0]);
	
	System.out.println("=============array of strings=============");
	
	String [] names=new String[3];
	names[0]="Ali";
	names[1]="Suri";
	names[2]="Debbi";
	
	System.out.println(names[0] );
	
	System.out.println("====array of boolean=========");
	boolean [] b=new boolean[3];
	b[0]=true;
	b[1]=true;
	b[2]=false;
	System.out.println(b[2]);
	
	//how many elements in array
	int Lenght=b.length;
	System.out.println(Lenght);
	
	
	
	
	
	
	
	
	
}
}
