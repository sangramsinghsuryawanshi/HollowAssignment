package hollowpattern;

import java.util.Scanner;

public class HollowPatternThirty 
{

	public HollowPatternThirty(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				
					System.out.print("*");
				
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
		HollowPatternThirty h = new HollowPatternThirty(n);
	}

}