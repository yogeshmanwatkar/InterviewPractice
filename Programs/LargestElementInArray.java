package com.practiceInterview;

public class LargestElementInArray {
//to find largest element in array
	public static void main(String[] args) 
	{
		int arr[]= {100,34,96,78};
		int size =arr.length;
		int temp;
		
		System.out.println("Size of array " +size);
		System.out.println("elements in array ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Elements of array in assending order");
	
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] =arr[j];
					arr[j]= temp;
					
				}
			}System.out.println( +arr[i] );
		}
		
		System.out.println("Lrgest element in array "+arr[size-1]);
		//System.out.println(arr[size-1]);
		
	}

}
