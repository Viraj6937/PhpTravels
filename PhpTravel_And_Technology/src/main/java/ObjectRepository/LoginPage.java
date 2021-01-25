package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	public WebDriver driver;
	
	//---------- Login Credentials ----------------->
	
		private By userName = By.xpath("//input[@name='username']");
		
		private By password = By.xpath("//input[@name='password']");
		
		private By SubmitBtn = By.xpath("//button[@class='btn btn-primary btn-lg btn-block loginbtn']");
		
	
		
		
    //----------- User Dashboard ----------------------->
		
		private By verifyUserName = By.xpath("//html//body//h3[text()='Hi, Demo User']");
	
		
		
		
		
		
		public LoginPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			
			this.driver = driver;
		}


		public WebElement getUserName() {
			
			return driver.findElement(userName);
		}
	
		
		public WebElement getPassword() {
			
			return driver.findElement(password);
		}
		
		
		public WebElement getLoginBtn() {
			
			return driver.findElement(SubmitBtn);
		}
		
		
		
	    public void getUserVerifiedText() {
	    	
	    	
	    	WebElement aa = driver.findElement(SubmitBtn);
	    	
	    	WebDriverWait w = new WebDriverWait(driver,10);
	    	
	    	w.until(ExpectedConditions.visibilityOf(aa));
	    	
	    	
	    	boolean bb = driver.findElement(verifyUserName).isDisplayed();
	    	
	    	if(bb)
	    	{
	    		
	    		String txtVal = driver.findElement(verifyUserName).getText();
	    	
	    		 System.out.println(txtVal);
	    	
	    	}
	    	else
	    	{
	    		System.out.println("No User Name Found");
	    	}
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    }
		
		
		
}
