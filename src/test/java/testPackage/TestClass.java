package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import mainpackage.MainClass;
import pageobjectpackage.SamplesFormObjects;

import org.openqa.selenium.WebDriver;
public class TestClass extends MainClass{

	@Test
	public void sendingValue() {
		SamplesFormObjects obj=new SamplesFormObjects(driver);
		obj.sampleFlow1();
		obj.sampleFlow2();
		
	}
	
}
