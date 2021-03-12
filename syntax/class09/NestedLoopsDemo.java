package com.syntax.class09;

public class NestedLoopsDemo {
public static void main(String[] args) {
	
	for(int i=1; i<3; i++) {
		//System.out.println(i);
		for(int j=1; j<=4; j++) {
			System.out.print(i+" "+j);
		}
	}
	System.out.println("====================print numbers from 10-99===================");
	
	for(int i=0; i<10; i++) {
		for(int j=0; j<=9; j++) {
			System.out.println(i+" "+j);
		}
	}
	System.out.println("=========car odometr==============");
	for(int i=0; i<10; i++) {
		for(int j=0; j<=9; j++) {
			for(int k=0; k<=9; k++) {
				for(int l=0; l<=9; l++) {
					System.out.print(i+" "+j+" "+k+" "+l);
				}
			}
		}
	}
}
}
