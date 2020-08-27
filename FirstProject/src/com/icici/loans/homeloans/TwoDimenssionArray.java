package com.icici.loans.homeloans;

public class TwoDimenssionArray 
{

	public static void main(String[] args) 
	{
		
		int a[][] = {
						{1,2,3,4},
						{4,5,6},
						{7,8,9,10,11},
					};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j] + "   ");
			}
			System.out.println();
		}
		
		
		for(int[] row : a)
		{
			for(int r : row)
			{
				System.out.print(r + "   ");
			}
			System.out.println();
		}

	}

}
