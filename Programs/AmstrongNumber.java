package com.practiceInterview;
//Amstrong number
public class AmstrongNumber {

	public static void main(String[] args) {
		
		int num=371,temp,sum =0,rem;
		temp=num;
		while(num>0)
		{
			rem= num%10;
			sum = (int)(sum + Math.pow(rem, 3));
			num = num/10;
		}
			if (temp == sum) {
				System.out.println("No. is Amstrong");
				
			}
			else {
				System.out.println("Not an Amstrong");
			}
	}

}
