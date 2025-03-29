package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Mb_windowhandle {
WebDriver driver;
	
	public  Mb_windowhandle(WebDriver driver) throws InterruptedException
	{
		this.driver=driver;
	}
	public void windowhandle()
	{
		String parentWindow=driver.getWindowHandle();
		System.out.println("parent Window Title " +driver.getTitle());	
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)", "");
		driver.findElement(By.xpath("//*[@id=\"menu-item-8588\"]/a/span")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div/div[2]/a[3]/img")).click();
		
		Set<String> allwindowhandles= driver.getWindowHandles();
		for(String handle:allwindowhandles)
			{
				System.out.println(handle);

				if(!handle.equalsIgnoreCase(parentWindow))
				{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//div[@class='yt-tab-shape-wiz__tab'][normalize-space()='Videos']")).click();
			//	driver.close();
				}
			driver.switchTo().window(parentWindow);
		}
			
	}
}
