package javaassingments;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("please enter the string you are trying to count the occurance of the characters");
		Scanner sc = new Scanner(System.in);
		String words =sc.next();
		charCount(words);

	}
	
	private static void charCount(String str) {
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		if(str != null) {
		for(int i= 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			int count;
			if(map.containsKey(ch)) {
				count = map.get(ch);
				count = count +1;
				map.put(ch , count);
				
			} else {
				map.put(ch , 1);
			}
			
		}
		System.out.println("the occurance of each character is "+ Arrays.asList(map));
		}
	}

}
