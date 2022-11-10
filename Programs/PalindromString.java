package com.practiceInterview;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter any String ");
		String Originalstring = sc.nextLine();
		String reverse = "";
		int length = Originalstring.length();
		
		for(int i =length-1; i>=0; i--)
		{
			reverse = reverse + Originalstring.charAt(i);
		}
		if(Originalstring.equalsIgnoreCase(reverse))
		{
			System.out.println("Given String is palindrom : "+reverse);
		}
		else
		{
			System.out.println("Given String is Not palindrom : "+reverse);
		}

	}

}
