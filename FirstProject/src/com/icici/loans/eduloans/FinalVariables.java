package com.icici.loans.eduloans;

public class FinalVariables
{
	 protected final int x=10;
	static int y=20;
	public final static String cname = "vmware";

	public  void m5()
	{
		
	}
	
	public static void main(String[] args) 
	{
		final int z=30;
		FinalVariables obj = new FinalVariables();
		System.out.println(obj.x);
		obj.x=100;
		System.out.println(obj.x);
		
		System.out.println(FinalVariables.y);
		FinalVariables.y=200;
		System.out.println(FinalVariables.y);
		
		System.out.println(z);
		z=300;
		System.out.println(z);

	}

}
