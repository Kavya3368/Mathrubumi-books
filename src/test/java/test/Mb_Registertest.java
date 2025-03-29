package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Mb_register;

public class Mb_Registertest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void openurl() throws InterruptedException
	{
		driver.get("https://www.mbibooks.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
	}
	@Test
	public void testregister() {
		driver.findElement(By.xpath("//*[@id=\"menu-item-750694\"]/a")).click();
		Mb_register rp=new Mb_register(driver);
		rp.setvalues("karthikkr@gmail.com", "Krkarthik@123");
		driver.findElement(By.xpath("//div[@class='woocommerce']//a[contains(text(),'Logout')]")).click();
	}
}
