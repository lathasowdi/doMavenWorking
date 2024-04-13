

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * Class to instantiate the web driver
 */
public class DriverManager {
	 
	private static WebDriver driver;
	/**
	 * Constructors to construct chrome driver
	 * @return  the web driver instance
	 */
	public static WebDriver getDriver() {
		if(driver == null) {
			setChromeDriver();
		}
		return driver;
	}
	
	/**
	 * Set property and instantiate chrome driver
	 */
	public static void setChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/lkumarasamy/Selenium/drivers/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
	}
	/**
	 * Set property and instantiate FirefoxDrive
	 */
	public static void setFireFoxDriver() {
		System.setProperty("webdriver.gecko.driver", "C:/Users/lkumarasamy/Selenium/drivers/geckodriver-v0.34.0-win64/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	/**
	 * Closes all the windows of the application under test
	 */
	public static void quitDriver() {
		if (!(driver == null)) {
			driver.quit();
		}
		driver = null;
	}
}