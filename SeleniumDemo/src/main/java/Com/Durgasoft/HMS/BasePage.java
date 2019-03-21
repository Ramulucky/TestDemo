package Com.Durgasoft.HMS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasePage {
/** @author Ramesh
 * 
 */
	public WebDriver driver;
	public void browserLaunch(String browser, String url)
	{
		if (browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if (browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.IEDriver.driver", 
					System.getProperty("user.dir")+"//Drivers//IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
		}		
		driver.get(url);
	}
}
