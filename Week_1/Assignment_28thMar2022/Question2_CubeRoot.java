package Assignment_28thMar2022;

import java.util.Scanner;

public class Question2_CubeRoot 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for finding the cube root of that number");
		int num=sc.nextInt();
		int binary_cbrt=cbrtBinary(num);
		System.out.println("The cube root of given number is:"+binary_cbrt);
	}

	public static int cbrtBinary(int num) 
	{
		int start=0;
		int end=num/2;
		int ans=0;
		while(start<=end)
		{
		int mid=start+(end-start)/2;
		if(mid*mid*mid==num)
		{
			return mid;
		}
		else if(mid*mid*mid<num)
		{
			start=mid+1;
		}
		else if(mid*mid*mid>num)
		{
			end=mid-1;
		}
		}
		
	return -1;	
	}
}
