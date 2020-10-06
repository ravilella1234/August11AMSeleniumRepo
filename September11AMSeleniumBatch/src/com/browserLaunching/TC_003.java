package com.browserLaunching;

import org.apache.log4j.Logger;

public class TC_003 extends BaseTest
{
	private static final Logger log = Logger.getLogger(TC_003.class);

	public static void main(String[] args) throws Exception 
	{
		init();
		log.info("Properties inits..");
		
		launch("chromebrowser");
		log.info("Launching the browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigated to url : " + childprop.getProperty("amazonurl"));
		
		driver.manage().window().maximize();
		
		selectOption("amazondropdox_id","Books");
		log.info("Selected the item Books By using the locator : " + orProp.getProperty("amazondropdox_id"));
		
		typeText("amazontextbox_name","sony");
		log.info("Entered the test Sony by using the locator :- " + orProp.getProperty("amazontextbox_name"));
		
		clickElement("amazonsearchbotton_xpath");
		log.info("Clicked on Searchbutton By usong locator :- " + orProp.getProperty("amazonsearchbotton_xpath"));
				
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//driver.findElement(By.name("field-keywords")).sendKeys("sony");
		
		//driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();

	}

	

}
