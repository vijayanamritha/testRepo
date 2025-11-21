package sess31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//1.Capture the drop down
		WebElement drpCountryEle=driver.findElement(By.xpath("//select[@id='country']"));
		//2.Create an object of select class and pass the dropdown element to that object
		Select drpCountry=new Select(drpCountryEle);
		//3.Select one option from the dropdown
		//drpCountry.selectByVisibleText("France");
		//drpCountry.selectByValue("uk");
		//drpCountry.selectByIndex(1);
		//4.Capture all the options and count the number of options
		List<WebElement> options=drpCountry.getOptions();
		//5.Count the number of options
		System.out.println(options.size());
		//6.Print each option
		//Normal for loop
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		//Enhanced for loop
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
		
		

	}

}
