package sess30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramedEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		WebElement Myframe=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		driver.switchTo().frame(Myframe);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
		//driver focuss switched back to main page
		driver.switchTo().defaultContent();
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Welcome");
		//nexted frames/inner frames handling
		
		driver.switchTo().defaultContent();
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		//As there is only oen inner frame inside the frame3 we can use index
		driver.switchTo().frame(0);
        driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
        
        //Using javaScript executor if you couldnt capture frames and got Element intercepted exception or Element not clickable exception
        WebElement innerframe=driver.findElement(By.xpath("//div[@id='i12']//div[@class='AB7Lab Id5V1']"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",innerframe );
        driver.switchTo().defaultContent();
        WebElement frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));        
        driver.switchTo().frame(frame5);
        driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']")).click();
      boolean logoDisplayed=  driver.findElement(By.xpath("//img[contains(@src,'/Content/Images/ui.vision.logo2.webp')]")).isDisplayed();
      if(logoDisplayed=true)
      {
    	  System.out.println("TC pass");
      }
      else
      {
    	  System.out.println("TC failed");
      }
	}

}
