package pages;

import org.openqa.selenium.WebDriver;

public class Mb_crsbrowserpg {
WebDriver driver;

	
	public Mb_crsbrowserpg (WebDriver driver) throws InterruptedException
	{
		this.driver=driver;
		
	}
	public void openurl() throws InterruptedException
	{
		driver.get("https://www.mbibooks.com");
		Thread.sleep(5000);
	}
}
