package sess31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
        //Capture Employee status dropdown
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]")).click();
        //To wait for elements to be visible
        Thread.sleep(500);
        //driver.findElement(By.xpath("//span[text()='Freelance']")).click();
        //Capture all the elements and count it and then print it
       List<WebElement> options= driver.findElements(By.xpath("//div[@class='oxd-select-option']/span"));
        System.out.println(options.size());
        for(WebElement op: options)
        {
        	System.out.println(op.getText());
        	/*if(op.getText().equals("Full-Time Contract"))
        	{
        		op.click();
        	}*/
        }
        
        
	}

}
