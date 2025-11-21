package sess37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");	
		driver.manage().window().maximize();
		//single file Upload
		//driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\Amritha\\Downloads\\Day-37.txt");
	    //Validation of uploaded file name
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Day-37"))
		{
			System.out.println("Upload successfull");
		}
		else
		{
			System.out.println("Uplaod Failed");
		}
		//Multiple file uplaod
		String file1="C:\\Users\\Amritha\\Downloads\\Day-37 (1).txt";
		String file2="C:\\Users\\Amritha\\Downloads\\Day-37 (2).txt";
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		//validation
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Day-37 (1)") && driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Day-37(2)"))
		{
			System.out.println("Multiple file uploaded successfully");
		}
		else
		{
			System.out.println("File upload failed");
		}
	}

}
