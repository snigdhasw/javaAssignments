package javaassingments;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("please enter the string you are trying to find the vowel");
		Scanner sc = new Scanner(System.in);
		String words =sc.next();
		
		getVowel(words);
		sc.close();
		

	}
	
	private static void getVowel(String str) {
		
		int vowel = 0;
		int consonant = 0;
		
		for(int i = 0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e'|| ch =='i' || ch =='o' || ch =='u'  ) {
				
				vowel = vowel+1;
			} else {
				consonant = consonant+1;
			}
			
		}
		System.out.println("The word  containts "+ vowel +" no of vowels and "+consonant+" no of consonant");
	}

}
