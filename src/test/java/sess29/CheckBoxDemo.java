package sess29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//Case1:Selecting specific check box-Monday
		//driver.findElement(By.xpath("//input[@id=\"monday\"]")).click();
		//Case2:Selecting multiple checkboxes
		//Find an attribute or multiple attributes matches with all the elements to be located and use selector hub to verify the same
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		//checkboxes variable is an arraylist, from that arraylist we need to take each checkbox and clcik it
		//1.Using normal for loop
		/*for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		//2.Using enhanced for loop
		for(WebElement box:checkboxes)
		{
			box.click();
		}*/
		//Case 3:elect last 3 checkboxes
		//Formula is:Starting index=Total checkboxes-number of checkboxes to be selected
		
		/*for(int i=checkboxes.size()-3;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		
		//Select first 3 checkboxes
		for(int i=0;i<=2;i++)
		{
			checkboxes.get(i).click();
		}
		//Unselect selected checkboxes
		Thread.sleep(60);
		for(int i=0;i<checkboxes.size();i++)
		{
			if(checkboxes.get(i).isSelected())
			{
				checkboxes.get(i).click();
			}
		}
		
		
	}

}
