package pages;

import org.openqa.selenium.WebDriver;

public class Mb_contentverify {
	WebDriver driver;
	
	public Mb_contentverify (WebDriver driver) throws InterruptedException
	{
		this.driver=driver;
	}
	public void verifycontent()
	{
		String src=driver.getPageSource();
		if(src.contains("Popular Categories"))
		{
		System.out.println("Content verified");
		}
		else
		{
		System.out.println("Content verification failed");
		}
	}
}
