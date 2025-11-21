package sess38;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddExtensionsDemo1 {

	public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();

        File selectorHubExtension = new File("C://Users//Amritha//Downloads//SelectorsHub.crx");
        options.addExtensions(selectorHubExtension);
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();

	}

}
