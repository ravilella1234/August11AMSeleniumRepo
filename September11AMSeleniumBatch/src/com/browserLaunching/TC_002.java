package com.browserLaunching;

public class TC_002 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launch("chromebrowser");
		
		navigateUrl("iciciurl");

	}

}
