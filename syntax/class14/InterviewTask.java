package com.syntax.class14;

public class InterviewTask {
//palindrom
	boolean isMirror(String str) {
		String newStr="";
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.println(i+" "+str.charAt(i));
			newStr+=str.charAt(i);
		}
		System.out.println(newStr);
		
		if(str.equals(newStr)) {
		return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		InterviewTask obj=new InterviewTask();
		System.out.println(obj.isMirror("aba"));
		System.out.println(obj.isMirror("abcdef"));
	}
}
