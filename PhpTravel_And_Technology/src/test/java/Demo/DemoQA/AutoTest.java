package Demo.DemoQA;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepository.LandingPage;
import ObjectRepository.LoginPage;
import Resources.Base;

public class AutoTest extends Base {

	public WebDriver driver;
	
	
	@BeforeTest
	public void navUrl() throws IOException {
		
		driver = InitializeDriver();
		
		driver.get(prop.getProperty("url"));

		driver.manage().window().maximize();
		
	}
	
	
	@Test
	public void T1() {
		
		
		//------ Validate The LandingPage By Getting Title --------->
		
	  	System.out.println(driver.getTitle());
		
	  	
	  	//----------- Login --------------------------->
	  	
		LandingPage lp = new LandingPage(driver);
	  	
		lp.getMyAccountBtnClick();
		
		lp.getLoginLinkClick();
		
		
		
		//----------- Login Validation ---------------->
		
		LoginPage lp2 = new LoginPage(driver);
		
		lp2.getUserName().sendKeys("user@phptravels.com");
		
		lp2.getPassword().sendKeys("demouser");
		
		lp2.getLoginBtn().click();
		
		lp2.getUserVerifiedText();
		
		
	  	
	}
	
	
	@AfterTest
	public void terminate() {
		
		driver.quit();
	}
	
	
	
}
