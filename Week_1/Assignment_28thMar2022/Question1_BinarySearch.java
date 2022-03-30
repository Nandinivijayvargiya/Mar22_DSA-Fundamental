package Assignment_28thMar2022;

import java.util.Scanner;

public class Question1_BinarySearch 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the numbers in(sorted form) array:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element you want to find index of:");
		int key=sc.nextInt();
        int index_binary=binarySearch(arr,key);
        System.out.println("The element through binary search found at index:"+index_binary);
	}

	public static int binarySearch(int[] a, int key) 
	{
		int start=0;
		int end=a.length-1;
		
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			
			if(a[mid]==key)
			{
				return mid;
			}
			else if(key>a[mid])
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
	return -1;
   }
}

