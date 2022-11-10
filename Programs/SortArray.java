package com.practiceInterview;
//sorting elements in array in decending order
public class SortArray {

	public static void main(String[] args) 
	{
		int a [] = {10,59,90,38,60};
		int temp;
		System.out.println("Elements in given array : ");
		
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
//Sort array in decending order
		for(int i=0;i<=a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i]= a[j];
					a[j]=temp;
					
				}
				
			}
		//elements after sorting
			}
		System.out.println("After sorting");
		for(int i=0;i<a.length;i++)
		{
			
			System.out.println(a[i]);
		}
		
	}

}
