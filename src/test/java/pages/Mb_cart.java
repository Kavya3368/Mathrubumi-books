package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Mb_cart {
	WebDriver driver;

	public Mb_cart (WebDriver driver)
	{
	this.driver=driver;
	}
	public void cart_add()
	{
	driver.findElement(By.xpath("//*[@id=\"s\"]")).sendKeys("Goat Days",Keys.ENTER);
	driver.findElement(By.xpath("//*[@id=\"product-385946\"]/div/div[1]/div/div/form/button")).click();
	driver.navigate().back();
	driver.navigate().back();
	driver.findElement(By.xpath("//*[@id=\"menu-main-categories-books-1\"]/li[1]/a/span/span")).click();
	driver.findElement(By.xpath("//*[@id=\"s\"]")).sendKeys("The Great Blindness",Keys.ENTER);
	driver.findElement(By.xpath("//div[@class='images']//button[@type='submit'][normalize-space()='Add to cart']")).click();	
	driver.findElement(By.xpath("//span[normalize-space()='2 items']")).click();
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,4000)", "");
	driver.findElement(By.xpath("//a[normalize-space()='Proceed to checkout']")).click();
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div/nav/a")).click();
	}

}
