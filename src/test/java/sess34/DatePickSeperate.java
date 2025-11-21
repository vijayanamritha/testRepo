package sess34;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePickSeperate {

	static void FutureDatepicker(WebDriver driver, String year, String month, String date)
	{
		//Year and month
		while(true)
		{
			//Capture current year
			String display_Year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			//Capture current month
			String display_Month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			if(display_Year.equals(year)&& display_Month.equals(month))
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			
		}
		//date
		//Capture all the dates and store it in a list collection of webelements
		List<WebElement> all_Dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a[@class='ui-state-default']"));
		for(WebElement dt:all_Dates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
					
		}
	}
	
	static void PastDatepicker(WebDriver driver, String year, String month, String date)
	{
		//Year and month
		while(true)
		{
			//Capture current year
			String display_Year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			//Capture current month
			String display_Month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			if(display_Year.equals(year)&& display_Month.equals(month))
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			
		}
		//date
		//Capture all the dates and store it in a list collection of webelements
		List<WebElement> all_Dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a[@class='ui-state-default']"));
		for(WebElement dt:all_Dates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
					
		}
	}
}
