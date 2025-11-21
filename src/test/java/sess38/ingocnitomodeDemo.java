package sess38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ingocnitomodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.close();
		

	}

}
