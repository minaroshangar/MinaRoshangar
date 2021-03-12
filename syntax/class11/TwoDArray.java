package com.syntax.class11;

public class TwoDArray {
public static void main(String[] args) {
	
	int [] [] num=new int [3][4];// 3 row, and 4 columns
	
	//first array or first row
	num[0][0]=1;
	num[0][1]=2;
	num[0][2]=3;
	num[0][3]=4;
	
	// second array or second row
	num[1][0]=10;
	num[1][1]=20;
	num[1][2]=30;
	num[1][3]=40;
	
	//third array or third row
	num[2][0]=100;
	num[2][1]=200;
	num[2][2]=300;
	num[2][3]=400;
	
	System.out.println(num[1][3]);//40
	System.out.println(num[2][2]);//300
	
	System.out.println("===============second way and shorter way==================");
	int[][] numbers= {{1,2,3,4},{10,20,30,40},{100,200,300,400}};
	
	System.out.println(numbers[1][0]);//10
	System.out.println(numbers[1][1]);//20
	
	//to reassign a number
	
	numbers[2][2]=500;   //was 300, reassigned to 500
	System.out.println(numbers[2][2]);
}
}
