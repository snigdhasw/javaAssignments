package javaassingments;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DupCharcter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("please enter the String to find out the no. char is being repeated ");
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		//findDuplicateChar();
		diplicateChar(word);

	}
	
	private static HashMap<Character, Integer> findDuplicateChar(String str1) {
		
		//String str1 = "absahbchaccccc";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<str1.length(); i++) {
			char ch = str1.charAt(i);
			
			if(map.containsKey(ch)) {
				int count = map.get(ch);
				count = count+1;
				map.put(ch, count);
				
			} else {
				map.put(ch, 1);
			}
			
		}
		
		System.out.println(Arrays.asList(map));
		return map;
		
	}
	
	private static void diplicateChar(String str) {
		
		HashMap<Character, Integer> map = findDuplicateChar(str);
		
		if(!map.isEmpty()) {
			 Set<Character> set = map.keySet();
			 for(char temp : set) {
				if(map.get(temp) >1) {
					
					System.out.println(temp +" is repeated "+ map.get(temp) +" times");
				}
				 
			 }
		}
		
	}

}
