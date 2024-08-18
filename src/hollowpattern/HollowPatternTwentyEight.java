package hollowpattern;

import java.util.Scanner;

public class HollowPatternTwentyEight 
{

	public HollowPatternTwentyEight(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int k=n;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1 || i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		for(int i=2;i<=n;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--)
			{
				if(j==n || i==j)
				{
					System.out.print("*");
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
		HollowPatternTwentyEight h = new HollowPatternTwentyEight(n);
	}

}
