package com.syntax.class18;

import java.util.Scanner;

public class Account {
public double actualAccountBalance;
private String ActualUserName;
private String ActualPassword;

public boolean login(String enteredUsername, String enteredPasswrd) {
	if(enteredUsername.equals(ActualUserName)&& enteredPasswrd.equals(ActualPassword)) {
		return true;
	}else {
		return false;
	}
}

public boolean signUp(String enteredUsername, String enteredPasswrd,double enteredBalance) {
	
	
	if(enteredUsername.length()>15) {
		return false;
	}else {
		ActualUserName=enteredUsername;
		ActualPassword=enteredPasswrd;
		actualAccountBalance=enteredBalance;
		return true;
	}
	
}

boolean transferFunds(String userName, double enteredAccountBalance) {
	if( password.equals(ActualPassword)&& enteredAccountBalance<=actualAccountBalance){
		actualAccountBalance=actualAccountBalance-enteredAccountBalance;
		return true;
	}else {
		return false;
	}
	
}
public static void main(String[] args) {
	
	Account obj=new Account();
	Scanner scanner=new Scanner(System.in);
	while(true) {
		System.out.println("Enter 1 for signup 2 for login 3 for transfer 4 to exit the program");
		int input=scanner.nextInt();
		if(input==4) {
			break;
			
		}else if(input==3) {
			System.out.println("enter the amount you want to transfer ");
			double amount=scanner.nextDouble();
			System.out.println("please reenter your password");
			String pass=scanner.nextLine();
			Account.transferFunds(pass,amount);
		}
	}
}
}
