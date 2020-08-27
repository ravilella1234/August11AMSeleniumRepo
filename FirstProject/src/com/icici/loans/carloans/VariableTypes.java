package com.icici.loans.carloans;

public class VariableTypes
{
	// primitive variable
	int x=100; // instance (or) global (or) non-static 
	static String cname ="vmware"; // static (or) global 
	static VariableTypes obj;
	
	public void m1()
	{
		int x=200; // local 
		System.out.println(this.x);
		System.out.println(cname);
	}
	
	public static void m2()
	{
		obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(cname);
	}
	
	
	public static void main(String[] args)
	{
		obj = new VariableTypes(); // reference variable
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);
	}
	
	

}
