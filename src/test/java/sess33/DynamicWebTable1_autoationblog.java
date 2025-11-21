package sess33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable1_autoationblog {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//Here number of page is 4--not need to read hence
		//Need to find each page number and click it except page 1
		
		for(int p=1;p<=4;p++)
		{
			System.out.println("page is"+""+p);
			if (p>1)
			{
			WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()="+p+"]"));
			active_page.click();
			Thread.sleep(10000);
			}
			//Now read data from each page
			//1.Find number of rows
			int rows=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
			//read data from each row and each coloumn
			for(int r=1;r<=rows;r++)
			{
				for(int c=1;c<=4;c++)
				{
					if(c<4)
					{
					
					String data=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td["+c+"]")).getText();
					System.out.print(data);
					System.out.print("\t");
					}
					else {
						driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[4]/input[@type='checkbox']")).click();
					}
				}
				System.out.println("");
			}
			
		}
		
	}
	}	


