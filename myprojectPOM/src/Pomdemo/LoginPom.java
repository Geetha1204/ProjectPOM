package Pomdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPom {
	WebDriver driver;
	By Email=By.id("Email");
	By Password=By.name("Password");
	By Login=By.xpath("//input[@class='button-1 login-button']");
	public LoginPom(WebDriver driver)
	{
		this.driver=driver;
	}
	public void enteremail(String UN)
	{
		driver.findElement(Email).sendKeys(UN);
	}
	public void enterpassword(String pwd)
	{
		driver.findElement(Password).sendKeys(pwd);
	}
	public void clicklogin() {
		driver.findElement(Login).click();
		
	}
	

}
