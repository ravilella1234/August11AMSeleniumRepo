package com.browserLaunching;

import org.apache.log4j.Logger;

import com.relevantcodes.extentreports.LogStatus;

public class TC_004 extends BaseTest
{
	

	public static void main(String[] args) throws Exception 
	{
		
		init();
		test = report.startTest("TC_004");
		test.log(LogStatus.INFO, "Properties inits..");
				
		launch("chromebrowser");
		test.log(LogStatus.INFO, "Launching the browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Navigated to url : " + childprop.getProperty("amazonurl"));
		
		driver.manage().window().maximize();
		
		selectOption("amazondropdox_id","Books");
		test.log(LogStatus.INFO, "Selected the item Books By using the locator : " + orProp.getProperty("amazondropdox_id"));
		
		typeText("amazontextbox_name","sony");
		test.log(LogStatus.INFO, "Entered the test Sony by using the locator :- " + orProp.getProperty("amazontextbox_name"));
		
		clickElement("amazonsearchbotton_xpath");
		test.log(LogStatus.PASS, "Clicked on Searchbutton By usong locator :- " + orProp.getProperty("amazonsearchbotton_xpath"));
				
		
		report.endTest(test);
		report.flush();

	}

	

}
