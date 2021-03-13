package com.syntax.class13;

public class BankApplication {
public static void main(String[] args) {
	
	Account mina=new Account();
	mina.accountNumber="123";
	mina.userName="mina123";
	mina.password="pass123";
	mina.balance=1400;
	mina.login("mina123", "pass123");
}
}
