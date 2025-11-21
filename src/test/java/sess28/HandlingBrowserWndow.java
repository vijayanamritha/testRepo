package sess28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrowserWndow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()=\"OrangeHRM, Inc\"]")).click();
		//Approach 1 - 2broswer windows and converting set collection to list collection(array list) and getting each window id in a string
		//and passing that string variable to switch command to switch to the desired window opened
		
		/*Set<String> WindowIds=driver.getWindowHandles();
		    List<String>  myId =new ArrayList(WindowIds);
		    String Parentid=myId.get(0);
		    String ChildId=myId.get(1);
		    driver.switchTo().window(Parentid);
		    System.out.println(driver.getTitle());
		    driver.switchTo().window(ChildId);
		    System.out.println(driver.getTitle());*/
		    
		    //Approach 2 to iterate when we need to deal with multiple browser windows
		     
             Set<String> WindowIds=driver.getWindowHandles();
             for(String Ids: WindowIds)
             {
            	 String Title=driver.switchTo().window(Ids).getTitle();
            	 /*
            	  if(Title.equals("Human Resources Management Software | HRMS | OrangeHRM"))
            	 {
            		 driver.close();
            		 break;
            	 }
            	  */
            	 //close multiple windows
            	 if(Title.equals("Human Resources Management Software | HRMS | OrangeHRM")||Title.equals("Orange HRM"));
            	 {
            		 driver.close();
            		 
            	 }
             }
		    
		    
             
		    
		    
		    
		    
		        
		
		
		

	}

}
