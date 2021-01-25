package Demo.DemoQA;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.Base;

public class AutoTest extends Base {

	public WebDriver driver;
	
	
	
	@BeforeTest
	public void navUrl() throws IOException {
		
		driver = InitializeDriver();
		
		
		
		
	}
	
	
	@Test
	public void T1() {
		
	  	
		
	}
	
	
	@AfterTest
	public void terminate() {
		
		driver.quit();
	}
	
}
