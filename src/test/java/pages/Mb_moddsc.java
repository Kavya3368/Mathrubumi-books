package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mb_moddsc {
WebDriver driver;
	
	public Mb_moddsc (WebDriver driver) throws InterruptedException
	{
		this.driver=driver;
	}
	public void mouseovr() {
		
		
		WebElement mouse=driver.findElement(By.xpath("//*[@id=\"menu-navigation-dropdown-1\"]/li[1]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(mouse).perform();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menu-navigation-dropdown-1\"]/li[1]/ul/li[2]/a")));
		driver.findElement(By.xpath("//*[@id=\"menu-navigation-dropdown-1\"]/li[1]/ul/li[2]/a")).click();
	}
	public void dropdown()
	{
		driver.findElement(By.xpath("//*[@id=\"menu-main-categories-books-1\"]/li[4]/a/span/span")).click();
		WebElement sort =driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/form/select"));
		Select ob=new Select(sort);
		ob.selectByVisibleText("Sort by price: low to high");
	}
	public void scrolldown()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,9000)", "");
		driver.findElement(By.xpath("//*[@id=\"menu-item-8587\"]/a/span")).click();
	}
	
}
