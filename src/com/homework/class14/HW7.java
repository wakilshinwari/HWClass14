package com.homework.class14;

public class HW7 {

	public static void main(String[] args) {
		// How would you swap  2 strings without a temporary variable?
		
		String a="Hello";
		
		String b="Folks";
		
		System.out.println("it is before the swap: "+a+" "+b);

		
	a=a+b;
	
	b=a.substring(0, a.length()-b.length());
	a=a.substring(b.length());
	
	System.out.println("it is after the swap: "+a+" "+b);
	}

}
