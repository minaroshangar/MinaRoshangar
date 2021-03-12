package com.syntax.class07;

public class ForLoopDemo {
public static void main(String[] args) {
	System.out.println("-----------print even numbers from 20-1------- ");
	for(int i=20; i>=0;i-=2) {
		System.out.print(i+" ");
	}
	System.out.println();
	System.out.println("----second way--------");
	int k=20;
	while(k>=1) {
		k-=2;
		System.out.print(k+" ");
	}
}
}
