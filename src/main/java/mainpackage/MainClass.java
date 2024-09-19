package mainpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class MainClass {
	public WebDriver driver=null;
	@BeforeTest
	public void chromelaunch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to("https://www.mycontactform.com/samples.php/");
	}
	
	@AfterClass
	public void chromeCLose() 
	{
		driver.close();
	}
	
}
