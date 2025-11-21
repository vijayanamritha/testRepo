package sess41;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CitiBank {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) throws IOException, InterruptedException 
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
			driver.manage().window().maximize();
			//Capture webElements		
			WebElement IntialDeposit=driver.findElement(By.xpath("//input[@id='mat-input-0']"));
			WebElement Length=driver.findElement(By.xpath("//input[@id='mat-input-1']"));
			WebElement Interest=driver.findElement(By.xpath("//input[@id='mat-input-2']"));			
			
			//Read the test data values from the utils sheet
			//1.Give the path of the excel sheet
			String filepath=System.getProperty("user.dir")+"\\testdata\\caldata2.xlsx";
			//2.Find the number of rows in excel
			int totalRows=ExcelUtils.getRowCount(filepath,"Sheet1");
			
			//Read data from each cell
			for(int r=1;r<=totalRows;r++)
			{
				String InDep=ExcelUtils.getCellData(filepath,"Sheet1",r,0);
				String Len=ExcelUtils.getCellData(filepath,"Sheet1",r,1);
				String Rate=ExcelUtils.getCellData(filepath,"Sheet1",r,2);
				String Com=ExcelUtils.getCellData(filepath,"Sheet1",r,3);
				String Total_exp=ExcelUtils.getCellData(filepath,"Sheet1",r,4);
			//Pass above data into application
			//1)clear existing data and then pass values
			IntialDeposit.clear();
			Length.clear();
			Interest.clear();
			Thread.sleep(3000);
			//2)Pass value
			IntialDeposit.sendKeys(InDep);
			Length.sendKeys(Len);
			Interest.sendKeys(Rate);
			//As the click method is not working here - javascriptexecutor is used
			WebElement cmnd=driver.findElement(By.xpath("//mat-select[@id='mat-select-0']"));
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()",cmnd);
            List<WebElement> Compounding =driver.findElements(By.xpath("//div[@id='mat-select-0-panel']//mat-option"));
			for(WebElement option:Compounding)
			{
				if(option.getText().equals(Com))
				{
					option.click();
				}
			}
			Thread.sleep(4000);
			//Click run
			driver.findElement(By.xpath("//button[@id='CIT-chart-submit']")).click();
			//validation of actual output with expected output
			//1.Get the actual total
			String Total_act=driver.findElement(By.xpath("//span[@id='displayTotalValue']")).getText();	
			System.out.println("Expected"+Total_exp);
			System.out.println("Actual"+Total_act);
			if(Total_act.equals(Total_exp))
					{
				System.out.println("TC passed");
				ExcelUtils.setCellData(filepath,"Sheet1",r,6,"Pass");
				ExcelUtils.fillGreenColor(filepath,"Sheet1",r,6);
					}
			else
			{
				System.out.println("TC failed");
				ExcelUtils.setCellData(filepath,"Sheet1",r,6,"Fail");
				ExcelUtils.fillRedColor(filepath,"Sheet1",r,6);
				
			}
			}
			Thread.sleep(3000);
			driver.quit();
			System.out.println("Completed");
		}
     
	


	}


