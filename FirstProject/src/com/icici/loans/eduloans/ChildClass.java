package com.icici.loans.eduloans;

class parentClass
{
	public void workHard()
	{
		System.out.println("Parent : wakeup early, goto college... ");
	}
	
	public void care()
	{
		System.out.println("Parent : atmost care...");
	}
}

public class ChildClass extends parentClass
{
	public void workHard()
	{
		System.out.println("Child : wakeup anytime, goto bar/parlol... ");
	}
	
	public void love()
	{
		System.out.println("Child : iam in love...");
	}

	public static void main(String[] args) 
	{
		ChildClass c = new ChildClass();
		c.workHard();
		c.care();
		c.love();
		
	}

}
