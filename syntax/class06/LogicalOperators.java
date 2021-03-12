package com.syntax.class06;

import java.util.Scanner;

public class LogicalOperators {
public static void main(String[] args) {
	/*
	 * we need to get time
	 * based on time need to identify time of the day
	 * if time is 1-11-- morning
	 * if time is between 12-13-- noon
	 * if 14-17--afternoon
	 * if 18-21 evening
	 * if 22-24 night
	 */
	Scanner scan;
	int time;
	String timeOfTheDay;
	scan=new Scanner(System.in);
	System.out.println("please enter time in 24 hour format");
	time=scan.nextInt();
	
	if(time>=1 && time<=11) {
		timeOfTheDay="Morning";
		
	}else if(time>=12&& time<=13) {
		timeOfTheDay="noon";
	}else if(time>=14&& time<=17) {
		timeOfTheDay="afternoon";
	}else if(time>=18&& time<=24) {
		timeOfTheDay="evening";
	}else if(time>=22&& time<=24) {
		timeOfTheDay="night";
	}else {
		timeOfTheDay="invalid";
	}
	System.out.println("Based in entered time, time of the day is "+timeOfTheDay);
	
}
}
