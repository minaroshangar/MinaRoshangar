package com.syntax.class11;

public class AllValuesTwoDArray {
public static void main(String[] args) {
	
	int [][] numbers= {{10,20,30,40},{90,80},{1,2,3,4,5,6,7}};
	
	System.out.println(numbers.length);   //totals number of arrsys 3
	System.out.println(numbers[1].length);  //shows length of specific array
	
	for(int row=0; row<numbers.length;row++) {
		for(int col=0; col<numbers[row].length;col++) {
			System.out.println(numbers [row][col]+" ");
		}
		System.out.println();
	}
	
	System.out.println("============enhanced loop============");
	for(int []array:numbers) {
		for(int a:array) {
			System.out.println(a);
		}
	}
}
}
