package com.syntax.class09;

public class PatternReverse {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=6; j>=1; j-- ) {
				System.out.print(j+" ");
			}
			System.out.println();
			System.out.println("==printing 11111  22222   33333===========");
		}
		
		for(int r=1; r<=5; r++) {
			for(int c=1; c<=5; r++) {
				System.out.print(r+" ");
			}
			System.out.println();
		}
		System.out.println("==Triangle======");
		for(int r=1; r<=5; r++) {
			for(int c=1; c<=r; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
