package test;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Mb_cart;
import pages.Mb_contentverify;
import pages.Mb_logoscrsht;
import pages.Mb_moddsc;
import pages.Mb_login;
import pages.Mb_titleverify;
import pages.Mb_windowhandle;

public class Mb_Test {
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
	public void testlogin() throws InterruptedException, IOException 
	{
		driver.findElement(By.xpath("//a[normalize-space()='Login / Signup']")).click();
		Mb_login lp=new Mb_login(driver);
		lp.exceldata();
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
	}
	@Test
	public void testtitle() throws InterruptedException
	{
		Mb_titleverify tv=new Mb_titleverify(driver);
		tv.verifytitle();
	}
	@Test
	public void testcontent() throws InterruptedException
	{
		Mb_contentverify cv= new Mb_contentverify(driver);
		cv.verifycontent();
	}
	@Test
	public void mouseover() throws InterruptedException
	{
		driver.get("https://www.mbibooks.com/product-category/reference/");
		driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/button")).click();
		Mb_moddsc mor=new Mb_moddsc(driver);
			mor.mouseovr();
	}
	@Test
	public void dropdown() throws InterruptedException
	{
		Mb_moddsc dp =new Mb_moddsc(driver);
		dp.dropdown();
	}
	@Test
	public void scrolldown() throws InterruptedException
	{
		Mb_moddsc sp=new Mb_moddsc(driver);
		sp.scrolldown();
	}
	@Test
	public void test_windowhandle() throws InterruptedException 
	{
		
		Mb_windowhandle wh=new Mb_windowhandle(driver);
		wh.windowhandle();
	}
	@Test
	public void logoverify() throws InterruptedException
	{
		Mb_logoscrsht lg=new Mb_logoscrsht(driver);
		lg.logo();	
	}
	@Test
	public void screenshottest() throws InterruptedException, IOException
	{
		Mb_logoscrsht ss=new Mb_logoscrsht(driver);
		ss.screenshot();
	}
	@Test
	public void addcart()
	{
		Mb_cart c=new Mb_cart(driver);
		c.cart_add();
	}
	
}
