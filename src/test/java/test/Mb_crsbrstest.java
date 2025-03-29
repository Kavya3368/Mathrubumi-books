package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.Mb_crsbrowserpg;


public class Mb_crsbrstest {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void Mb_crsbrowser(String browser) throws InterruptedException {
		if(browser.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		Mb_crsbrowserpg cb=new Mb_crsbrowserpg(driver);
		cb.openurl();
	}
}
