package com.browserLaunching;

public class TC_001 extends BaseTest
{

	public static void main(String[] args) 
	{
		launch("chrome");
		
		navigateUrl("https://www.amazon.in");

	}

}