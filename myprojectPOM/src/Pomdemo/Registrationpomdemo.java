package Pomdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registrationpomdemo {
	WebDriver driver;
	By gender=By.xpath("//input[@id='gender-female']");
	By firstname=By.xpath("//input[@id='FirstName']");
	By lastname=By.xpath("//input[@id='LastName']");
	By email=By.xpath("//input[@id='Email']");
	By password=By.xpath("//input[@id='Password']");
	By confirmpassword=By.xpath("//input[@id='ConfirmPassword']");
	By registerbtn=By.xpath("//input[@id='register-button']");
	
	public Registrationpomdemo(WebDriver driver)
	{
		this.driver=driver;
	}
	public void gender()
	{
		driver.findElement(gender).click();
	}
	public void firstname(String fn)
	{
		driver.findElement(firstname).sendKeys(fn);
	}

	public void lastname(String ln)
	{
		driver.findElement(lastname).sendKeys(ln);
	}
	public void email(String em)
	{
		driver.findElement(email).sendKeys(em);
	}
	public void password(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	public void confirmpassword(String cpwd)
	{
		driver.findElement(confirmpassword).sendKeys(cpwd);
	}
	public void clickregister()
	{
		driver.findElement(registerbtn).click();
	}
	
	
	
	
	
	}
	


			
			
	
