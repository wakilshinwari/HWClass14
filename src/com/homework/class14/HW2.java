package com.homework.class14;

public class HW2 {

	public static void main(String[] args) {
		// Create a String that should be combination of letters, numbers and special characters. 
		//Find out how many alpha characters are there in the String.
		
		String str="567Shinwari123456789!@#$%^&*";
		
		int num=0;
		
		for (int i=0; i<str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				num++;
			}
		}
		
		System.out.println(num);

	}

}
