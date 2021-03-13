package com.syntax.class13;

public class Account {

	String userName;
	String password;
	double balance;
	String accountNumber;
	boolean isLoggedIn;
	
	public void login(String pass,String pass1) {
		if(userName.equals("Yulia")&& password.equals("pass123")) {
			System.out.println("welcome to Bank of America your balance is "+balance);
		}else {
			System.out.println("username and password is not correct");
		}
	}
		public void printInfo() {
			if(isLoggedIn) {
				System.out.println("your account number is "+accountNumber+"your balance is "+balance);
			}
		}
	}

