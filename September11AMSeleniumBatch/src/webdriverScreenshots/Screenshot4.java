package webdriverScreenshots;

import java.io.File;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot4 
{

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Date dt = new Date(); System.out.println(dt);
		 * 
		 * String d = dt.toString().replace(':', '_').replace(' ', '_');
		 * System.out.println(d);
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Sept Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		Date dt = new Date(); 
		System.out.println(dt);
		String d = dt.toString().replace(':', '_').replace(' ', '_');
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			if(!links.get(i).getText().isEmpty())
			{
				String linkName = links.get(i).getText();
				links.get(i).click();
				
				File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(srcFile, new File("C:\\Users\\DELL\\Desktop\\screenshots\\"+linkName+d+".png"));
				
				driver.navigate().back();
				links = driver.findElements(By.tagName("a"));
			}
		}

	}

}
