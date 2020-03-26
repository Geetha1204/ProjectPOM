package Demowebshoptest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pomdemo.Registrationpomdemo;



public class VerifyRegistrationdemo {

	@Test
	public void checklogin(){
		System.setProperty("webdriver.chrome.driver","D:\\jar files\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com/register");
			driver.manage().window().maximize();
			Registrationpomdemo vrd=new  Registrationpomdemo(driver);
			vrd.gender();
			vrd.firstname("Geetha");
		    vrd.lastname("reddy");
			vrd.email("geethamaanvi123@gmail.com");
			vrd.password("welcome@123");
			vrd.confirmpassword("welcome@123");
			
			vrd.clickregister();
	

		
	
}

}