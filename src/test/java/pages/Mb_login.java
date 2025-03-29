package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Mb_login {
WebDriver driver;
	
	public Mb_login (WebDriver driver) throws InterruptedException
	{
		this.driver=driver;
		
	}
	public void exceldata() throws IOException 
	{
		File f =new File("C:\\Users\\Admin\\Desktop\\Automation pjt\\logindetails.xlsx");
		FileInputStream fi=new FileInputStream(f);
						XSSFWorkbook wb =new XSSFWorkbook(fi);
						XSSFSheet sh =wb.getSheet("Sheet1");
						
			System.out.println(sh.getLastRowNum());
			
			for(int i=1;i<=sh.getLastRowNum();i++)
			{
				String email =sh.getRow(i).getCell(0).getStringCellValue();
				System.out.println("email="+ email);
				String password=sh.getRow(i).getCell(1).getStringCellValue();
				System.out.println("password="+ password);
				
				driver.findElement(By.xpath("//input[@id='username']")).clear();
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
				driver.findElement(By.xpath("//input[@id='password']")).clear();
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
				
				driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
				driver.navigate().back();
			}
			wb.close();
	}
}
