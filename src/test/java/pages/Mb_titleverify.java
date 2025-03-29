package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Mb_titleverify {
WebDriver driver;
	
	public Mb_titleverify (WebDriver driver) throws InterruptedException
	{
		this.driver=driver;
		
	}
	public void verifytitle()
	{
		
		String Exp="Mathrubhumi Books: Buy Malayalam Books Online Kerala with best offer price";
		String actual=driver.getTitle();
		System.out.println(actual);
		Assert.assertEquals(Exp, actual);
		System.out.println("Title matched");
		
	}
}
