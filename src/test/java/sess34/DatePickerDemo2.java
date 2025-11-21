package sess34;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo2 {
	
	static Month Mconverter (String month)
	{
		HashMap<String,Month> dmonth=new HashMap<String,Month>();
		dmonth.put("January",Month.JANUARY);
		dmonth.put("February",Month.FEBRUARY);
		dmonth.put("March",Month.MARCH);
		dmonth.put("April",Month.APRIL);
		dmonth.put("May",Month.MAY);
		dmonth.put("June",Month.JUNE);
		dmonth.put("July",Month.JULY);
		dmonth.put("August",Month.AUGUST);
		dmonth.put("September",Month.SEPTEMBER);
		dmonth.put("October",Month.OCTOBER);
		dmonth.put("November",Month.NOVEMBER);
		dmonth.put("December",Month.DECEMBER);
		Month vmonth=dmonth.get(month);
		if(vmonth==null)
		{
			System.out.println("Invalid month");
		}
		return vmonth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a user defined method for conerting moth from string to 
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Amritha/Downloads/calendar-datepicker.html");
		driver.manage().window().maximize();
		//Select Year from dropdown
		WebElement YearDp=driver.findElement(By.id("year-select"));
		Select Year=new Select(YearDp);
		Year.selectByValue("2026");
		//Month
		
		while (true)
		{
		//Capture display month
		String Dismonth=driver.findElement(By.xpath("//div[@id='month-name']")).getText();
		//Convert expected month and display month from string to month object format
		String Expmonth="January";
		Month Expmonth1=Mconverter (Expmonth);
		Month Dismonth1=Mconverter(Dismonth);
		//Compare expected month with display month
		int value=Expmonth1.compareTo(Dismonth1);
		if(value>0)
		{
			//Click right side arrow and go to loop again and capture the month and compare again
			driver.findElement(By.xpath("//button[@id='next-btn']")).click();
		}
		else if (value<0)
		{
		  driver.findElement(By.xpath("//button[@id='prev-btn']")).click();	
		}
		else
		{
			break;
		}
		
		}
		//Date
		String ExpDate="10";
		List<WebElement> Dates= driver.findElements(By.xpath("//table[@id='calendar-table']//tbody//tr//td//"));
		for(WebElement date: Dates)
		{
			if(date.getText().equals(ExpDate))
			{
				date.click();
				break;
			}
		}	
		

	}

}
