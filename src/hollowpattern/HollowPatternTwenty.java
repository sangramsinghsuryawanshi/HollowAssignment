package hollowpattern;

import java.util.Scanner;

public class HollowPatternTwenty 
{
	public HollowPatternTwenty(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--)
			{
				if(j==n || i==j||i==1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number: ");
		int n = sc.nextInt();
		System.out.println("------------------------------------");
		HollowPatternTwenty h = new HollowPatternTwenty(n);
	}

}