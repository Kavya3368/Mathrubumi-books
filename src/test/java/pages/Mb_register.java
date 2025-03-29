package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Mb_register {
	WebDriver driver;
	
	By rpemail=By.xpath("//input[@id='reg_email']");
	By rppassword=By.xpath("//input[@id='reg_password']");
	By rpregister=By.xpath("//button[normalize-space()='Register']");
public Mb_register (WebDriver driver)
{
	this.driver=driver;
}
public void setvalues(String email, String password)
{
	
	driver.findElement(rpemail).sendKeys(email);
	driver.findElement(rppassword).sendKeys(password);
	driver.findElement(rpregister).click();
	
}
}
