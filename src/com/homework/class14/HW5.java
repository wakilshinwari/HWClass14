package com.homework.class14;

public class HW5 {

	public static void main(String[] args) {
		// How would you reverse a String word by word?

		String str = "I love Java";

		String[] words = str.split(" ");

		String reverseString = "";

		for (String r : words) {
			String reverseword = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				reverseword = reverseword + str.charAt(i);
			}
			reverseString=reverseString+reverseword+"";
			
			}
		System.out.println(reverseString);
		

		}

	
}

