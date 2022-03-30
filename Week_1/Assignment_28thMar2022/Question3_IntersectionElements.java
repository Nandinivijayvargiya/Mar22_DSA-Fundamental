package Assignment_28thMar2022;

public class Question3_IntersectionElements 
{
	public static void main(String args[])
	{
		int A[]= {3,6,8};
		int B[]= {1,2,3,5,6,90,789};
		System.out.print("Common digits in both arrays are:");
		for(int i=0;i<A.length;i++)
		{
		for(int j=0;j<B.length;j++)
		{
			if(A[i]==B[j])
			{
				System.out.print(A[i]+" ");
			}
		}
		}
	}
}
