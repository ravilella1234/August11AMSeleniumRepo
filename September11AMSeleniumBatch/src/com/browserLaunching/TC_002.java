package com.browserLaunching;

public class TC_002 extends BaseTest
{

	public static void main(String[] args) 
	{
		launch("firefox");
		
		navigateUrl("https://www.bestbuy.com");

	}

}
