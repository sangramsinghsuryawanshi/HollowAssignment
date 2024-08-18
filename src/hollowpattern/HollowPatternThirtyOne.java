package hollowpattern;

import java.util.Scanner;

public class HollowPatternThirtyOne 
{

	public HollowPatternThirtyOne(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i%2!=0)
				if(j==1 || i==n||j==n|| i==1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
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
		HollowPatternThirtyOne h = new HollowPatternThirtyOne(n);
	}

}