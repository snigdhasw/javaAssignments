package javaassingments;

import java.util.Scanner;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter the string from where you want to remove the duplicate");
		
		Scanner sc = new Scanner(System.in);
		String temp = sc.next();
		removeDupli(temp);

	}
	
	private static void removeDupli(String str) {
		
		String temp = "";
		for(int i = 0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
		   if(i == 0) {
			   
			   temp = temp+ch;
		   } else {
			    
			   if(temp.indexOf(ch) == -1) {
				   temp = temp+ch;
				   
			   }
		   }
			
		}
		System.out.println(temp);
		
	}

}
