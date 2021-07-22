package javaassingments;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter the first string you want to check for anagram");
		
		Scanner sc = new Scanner(System.in);
		String firstWord =sc.next();
		
		System.out.println("please enter the first string you want to check for anagram");
		String secondWord =sc.next();
		

		isAnagram(firstWord, secondWord);

	}
	
	private static void isAnagram(String first, String second) {
		 
		String s1 = first.replaceAll("\\s", "");
		String s2 = second.replaceAll("\\s", "");
		
		 char[] ch1 = s1.toCharArray();
		 char[] ch2 = s2.toCharArray();
		 
		 if(s1.length() == s2.length()) {
			 
			 Arrays.sort(ch1);
			 Arrays.sort(ch2);
			 
			 if(Arrays.equals(ch1, ch2)) {
				 System.out.println("words are anagram from if statement");
				 
			 } else {
				 
				 System.out.println("words are not anagram from else statement");
			 }
			 
		 } else {
			 System.out.println("words are not anagram sssss");
		 }
		
		
//		for(int i = first.length()-1; i>=0; i--) {
//			
//			temp = temp+first.charAt(i);
//		}
//		
//		if(temp.equals(second)) {
//			
//		   System.out.println("the words are anagram");
//		} else {
//			
//			System.out.println("the words are not anagram");
//		}
		
	}

}
