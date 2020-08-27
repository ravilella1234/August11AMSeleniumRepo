package com.icici.loans.homeloans;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		String s1 = "ravikanth";
		System.out.println(s1);
		System.out.println(s1.isEmpty());
		System.out.println(s1.length());
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf("v"));
		System.out.println(s1.startsWith("rav"));
		System.out.println(s1.endsWith("nt"));
		System.out.println(s1.substring(2, 7));
		System.out.println(s1.replace('r', 'k'));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		String s2 =new String("lella");
		System.out.println(s2);
		
		//s1=s1+s2;
		s1=s1.concat(s2);
		System.out.println(s1);
		
		
		String s3="ravikanth";
		String s4="Ravikan";
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println(s3.contains(s4));
		System.out.println(s3.contains(s4.toLowerCase()));
		
		String s5="ravikanth";
		String s6=" Ravikanth";
		System.out.println(s5.equals(s6)); 
		System.out.println(s5.equals(s6.trim()));
		System.out.println(s5.equals(s6.trim().toLowerCase()));
		
		String s7="ravi kanth lella";
		String[] str = s7.split(" ");
		
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		
		for(String s:str)
		{
			System.out.println(s);
		}
		

	}

}
