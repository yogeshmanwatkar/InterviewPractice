package com.practiceInterview;

import java.util.Scanner;

public class PalindromPractice2 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any three digit number : ");
		int number = sc.nextInt();
		//int number = 120;
		int r,temp,sum =0;
		temp = number;
		
		while(number>0)
		{
			r = number%10;
			sum = (sum*10)+r;
			number = number/10;
		}
		if(temp==sum)
		{
			System.out.println("Entered number is palindrom");
		}
		else {
			System.out.println("Entered Number is not palindrom");
		}

	}

}
