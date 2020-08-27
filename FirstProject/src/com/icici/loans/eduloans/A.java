package com.icici.loans.eduloans;

import java.util.Date;

public  class A 
{
	public int x=10;
	
	public  Number m1()
	{
		System.out.println("iam m1 from Class A");
		return x;
	}
	
	public static void m4()
	{
		System.out.println("iam m4 static method...");
	}
	
	static
	{
		System.out.println("iam static block...");
	}
	
	static
	{
		Date dt = new Date();
		System.out.println(dt);
	}
	
	public static void main(String[] args) {
		A a  = new A();
		a.m1();
		System.out.println(a.x);
		A.m4();
	}

}
