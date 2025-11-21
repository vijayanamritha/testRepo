package sess31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demos.codexworld.com/multi-select-dropdown-list-with-checkbox-jquery/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//Capture the dropdown first
		driver.findElement(By.xpath("//div[@id='ms-list-1']//button[@type='button']")).click();
        //Select one option
		driver.findElement(By.xpath("//input[@id='ms-opt-1']")).click();
		//Capture all the options
		List<WebElement> options=driver.findElements(By.xpath("//div[@class='ms-options']"));
		System.out.println(options.size());
		for(WebElement op:options)
		{
			System.out.println(op.getText());
			if(op.getText().equals("HTML")||op.getText().equals("iOS"))
			{
				op.click();
			}
			
		}
		
	}

}
