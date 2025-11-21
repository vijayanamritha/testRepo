package sess33;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class OranegHRMdemo {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
    driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='Admin']")).click();
    //total number of row--Need to capture dynamically as row number tend to change in a dynamic web table
    for(int c=2;c<=3;c++)
    {
    List<WebElement> coulomn1= driver.findElements(By.xpath("//div[@class='oxd-table-card']//div[@class='oxd-table-row oxd-table-row--with-border']//div[@class='oxd-table-cell oxd-padding-cell']["+c+"]"));
    if (c==2) {
    	System.out.println("username");
    }
    else {
    	System.out.println("Role");
    }
      for(WebElement data: coulomn1)
      {
      System.out.println(data.getText());
    	  System.out.print("\t");
      }
    }
    System.out.println("");
    List<WebElement> rows = driver.findElements(By.xpath("//div[contains(@class,'oxd-table-body')]//div[@role='row']"));
    int row=rows.size();
    System.out.println(row);
    
    }
    
  
	

}
