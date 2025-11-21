package sess34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo1 {
	//Creating an user defined datepicker method
	/*static void FutureDatepicker(WebDriver driver, String year, String month, String date)
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
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		//Case1--Textbox with input directly allowed by Sendkeys()
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10/03/2025");
		//Case2--Using datepicker element
		//first capture the date input box and click to display the datepicker element
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		//FutureDatepicker(driver,"2026","November","10");
		//PastDatepicker(driver,"2024","November","10");
		//Create a seperate class for datePicker and create an object for that class and call the method using that object
		DatePickSeperate dtpicker=new DatePickSeperate();
		dtpicker.FutureDatepicker(driver,"2026","November","10");
		
		
		
		

	}

}
