package Demowebshoptest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pomdemo.LoginPom;

public class VerifyLogin {
	@Test
	public void checklogin(){
		System.setProperty("webdriver.chrome.driver","D:\\jar files\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com/login");
			driver.manage().window().maximize();
			LoginPom login=new LoginPom(driver);
			login.enteremail("geethamaanvi123@gmail.com");
			login.enterpassword("welcome@123");
			login.clicklogin();
	}
}


