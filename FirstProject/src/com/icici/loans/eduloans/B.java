package com.icici.loans.eduloans;

public class B extends A  // IsA Relationship
{
	public  Number m1()
	{
		System.out.println("iam overridden m1 from Class B");
		return x;
	}
	
	public void m2()
	{
		System.out.println("iam m2 from Class B");
	}
	
	public static void main(String[] args) 
	{
		A a = new A();  // HasA Relationship
		a.m1();
		System.out.println(a.x);

		B obj = new B();
		obj.m1();
		System.out.println(obj.x);
		
		
	}

}
