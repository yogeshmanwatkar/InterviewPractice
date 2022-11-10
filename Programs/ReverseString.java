 package com.practiceInterview;
//Reverse String
public class ReverseString {

	public static void main(String[] args) {
		
		String str ="Yogesh Manwatkar";
		String rvsstr ="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rvsstr = rvsstr+str.charAt(i);
			
		}
		System.out.println(rvsstr);
	}

}
