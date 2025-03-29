package pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;

public class Mb_logoscrsht {
	WebDriver driver;

	public Mb_logoscrsht (WebDriver driver) throws InterruptedException
	{
		this.driver=driver;
	}
	public void logo()
	{
		
		boolean l=driver.findElement(By.xpath("//img[@alt='Mathrubhumi Books']")).isDisplayed();
		Assert.assertTrue(l);
	}
	public void screenshot() throws IOException
	{
		
				WebElement scsh=driver.findElement(By.xpath("//img[@alt='Mathrubhumi Books']"));
				File src1=scsh.getScreenshotAs(OutputType.FILE);
				FileHandler.copy(src1,new File("./Screenshot/mathrubumilogo.png"));
				//System.out.println("screenshot");
	}
}
