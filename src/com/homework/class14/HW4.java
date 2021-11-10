package com.homework.class14;

public class HW4 {

	public static void main(String[] args) {
		// How would you reverse a String character by character?
		
		String a="Java";
		String b="";
		
		for (int i=a.length()-1; i>=0;i--) {
			b+=a.charAt(i);
			
		}
		System.out.println(b);
	}

}
