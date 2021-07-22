package javaassingments;

import java.util.Scanner;

public class DigitCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String str = "3232323";
		System.out.println("please enter the string you wish to check whether it contains of all digits");
		Scanner sc = new Scanner(System.in);
		String temp = sc.next();
		boolean isTrue = digitCheck(temp);
		if(isTrue) {
			System.out.println("String contains only digit");
		} else {
			
			System.out.println("String doesn't contains only digit");
		}

	}
	
	public static boolean digitCheck(String str) {
		
		for(int i = 0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
            if(Character.isDigit(ch)) {
            	return true;
            } else {
            	return false;
            }
			
		}
		 return false;
	}

}
