package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver;
	public Properties prop;
	
	public WebDriver InitializeDriver() throws IOException {
		
		String file = System.getProperty("user.dir")+"\\src\\main\\java\\data.properties";
		
		FileInputStream fis = new FileInputStream(file);
		
		prop = new Properties();
		
		prop.load(fis);
		
		String BrowserName = prop.getProperty("browser");
		
		if(BrowserName.equals("chrome"))
		{
			String ch = System.getProperty("user.dir")+"\\driver\\chromedriver.exe";
		
			 System.setProperty("webdriver.chrome.driver", ch);
			 
			 driver = new ChromeDriver();
		
		}
		else
		{
			System.out.println("no chrome driver found");
		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		return driver;
		
	}
	
}
