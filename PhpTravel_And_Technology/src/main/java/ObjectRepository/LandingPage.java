package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {

	public WebDriver driver;
	
	//---- My Account Button Click ----------->
	

	private By MyAccntBtn = By.xpath("//div[@class='mini-menu']//ul//li[3]//div[@class='dropdown dropdown-login dropdown-tab']//a");
	
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}
	
	

	public void getMyAccountBtnClick() {
		
		WebElement aa = driver.findElement(MyAccntBtn);
		
		WebDriverWait w = new WebDriverWait(driver,10);
		
		w.until(ExpectedConditions.visibilityOf(aa));
		
		Actions ac = new Actions(driver).moveToElement(aa).click();
		
		ac.build().perform();
		
	}
	
	

}
