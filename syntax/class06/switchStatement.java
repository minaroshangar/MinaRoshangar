package com.syntax.class06;

public class switchStatement {
	public static void main(String[] args) {
		int day = 6;
		String weekDay;
		if (day == 1) {
			weekDay = ("today is Monday");
		} else if (day == 2) {
			weekDay = ("today is Tueday");
		} else if (day == 3) {
			weekDay = ("today is Wednesday");
		} else if (day == 4) {
			weekDay = ("today is Thursday");
		} else if (day == 5) {
			weekDay = ("Today is Friday");
		} else if (day == 6) {
			weekDay = ("today is Saturday");
		} else if (day == 7) {
			weekDay = ("Today is Sunday");
		} else {
			weekDay = "Invalid";
		}
		if (!weekDay.equals("Invalid")) {
			System.out.println("Today is " + weekDay);
		}
		System.out.println("----------using switch-------------");
		String weekDay1;
		switch(day) {
		case 1:
			weekDay1="Monday";
			break;
		case 2:
			weekDay1="Tuesday";
			break;
		case 3:
			weekDay1="Wednesday";
			break;
		case 4:
			weekDay1="Thursday";
			break;
		case 5:
			weekDay1="Friday";
			break;
		case 6:
			weekDay1="saturday";
			break;
		case 7:
			weekDay1="sunday";
			break;
		default:
			weekDay1="invalid";
			break;
			
		}
		System.out.println("Today is " + weekDay);
	}
}
