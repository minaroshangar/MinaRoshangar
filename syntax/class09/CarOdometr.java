package com.syntax.class09;

public class CarOdometr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("=========car odometr==============");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int k = 0; k <= 9; k++) {
					for (int l = 0; l <= 9; l++) {
						System.out.println(i + " " + j + " " + k + " " + l);
					}
				}
			}
		}
System.out.println("============clock=====================");
for(int h=0; h<24; h++) {
	
	for (int m=0; m<60; m++){
		if(h<10&&m<10) {
			System.out.println("0"+h+":0"+m);
		}else if(h<=10 && m>=10) {
			System.out.println("0"+h+":"+m);
		}else if(h>=10 && m<10) {
			System.out.println(h+":0"+m);
		}else {
		System.out.println(h+":"+m);
	}}}


	}

}
