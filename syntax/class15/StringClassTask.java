package com.syntax.class15;

public class StringClassTask {
public static void main(String[] args) {
	
	String username="Mina";
	String password="mina123";
	String confirmPass="";
	if(username.isEmpty() || password.isEmpty()) {
		System.out.println("username and password can not be empty");
	}else if(password.length( )<=8) {
		System.out.println("password is too short");
	}else if(!password.equals(confirmPass)) {
		System.out.println("Password donot match");
	}else if(password.equals(password)) {
		System.out.println();
	}
}
}
/*
 * Accept username, password and confirm password from a user and check following requirements:
Username and Password cannot be  empty, if so→ message="Username and Password cannot be empty".
Password should be minimum 8 characters, if less → message="Password is too short".
Password cannot contain username if so, → message="Password cannot contain username".
Password should match confirmed password, if not  → message="Passwords do not match".
Only after all requirements met → message "Your username and password has been created"
 * 
 * 
 */


