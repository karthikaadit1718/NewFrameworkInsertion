package pageobjectpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SamplesFormObjects {

	@FindBy(id="subject") WebElement inp_subject;
	
	@FindBy(id="email") WebElement inp_Email;
	
	@FindBy(id="q2") WebElement inp_q2;
	
	WebDriver driver;
	public SamplesFormObjects(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	public void sampleFlow1()
	{
		inp_subject.sendKeys("Testing");
		inp_subject.clear();
	}
	public void sampleFlow2()
	{
		inp_Email.sendKeys("gokulmas01@gmail.com");
		inp_subject.sendKeys("Testing");
		inp_q2.sendKeys("Selenium \n testing \n for \nform");		
	}
	
	//id,name,className,tagName, linkText,partialLinkText,xpath,css
}
