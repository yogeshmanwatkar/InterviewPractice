package com.practiceInterview;

public class ReverseString2 {

	
	public static void main(String[] args)
	{
		
		
		String a ="Yogesh";
		String b ="Manwatkar";	
		System.out.println("String before swapping :");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		a = a+b;
		 b = a.substring(0,a.length()-b.length());
		 a=a.substring(b.length());
		 System.out.println("String after swapping ");
		 System.out.println("a = "+a);
		 System.out.println("b = "+b);
		 
		

	}

}
