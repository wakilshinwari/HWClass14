package com.homework.class14;

import java.util.Scanner;

public class HW6 {

	public static void main(String[] args) {
		// How would you check if String is palindrome or not?

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a word");
		String reverse="";
		String original=scan.nextLine();
		
		for (int i=original.length()-1; i>=0; i--) {
			reverse=reverse+original.charAt(i);	
		}
		if (original.equals(reverse)){
			System.out.println("The word is palindrome");
		}else {
			System.out.println("The word is not palindrome");
		}
			
		
	}

}
