package com.syntax.class06;

public class switchExample {
	public static void main(String[] args) {
		/*
		 * store gender using M or F based on gender we will specify if M--> male if
		 * M--> female otherwise-->not sure
		 */

		char gender = 'M';
		String description;
		switch (gender) {
		case 'M':
			description = "Male";
			break;
		case 'F':
			description = "Female";
			break;
		default:
			description = "N/A";
			break;
		}
		System.out.println(description);
	}
}
