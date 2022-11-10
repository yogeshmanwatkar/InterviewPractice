package com.practiceInterview;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		String revs = "";
		String number = sc.nextLine();
		int length = number.length();
		
		for(int i = length-1; i>=0; i--)
		{
			revs = revs + number.charAt(i);
			
			
		}
		if(number.equals(revs))
		{
			System.out.println("Entered number is Palindrom : "+revs);

		}
		else 
		{
			System.out.println("Entered number is not Palindrom : "+revs);
		}
		
	}

}
