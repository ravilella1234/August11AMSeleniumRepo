package verifications;

import com.browserLaunching.BaseTest;

public class TC_007 extends BaseTest
{

	public static void main(String[] args) throws Exception
	{
		init();
		test = report.startTest("TC_007");
		launch("chromebrowser");		
		navigateUrl("amazonurl");
		
		String expectedLink = "New Release";
		
		if(!isLinkEqual(expectedLink))
				reportFailure("Both links are not equal....");
			else
				reportSuccess("Both links are equal...");
		
		report.endTest(test);
		report.flush();
		
	}

}
