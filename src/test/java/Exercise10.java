


import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
/**
 *  Class Instantiate the web driver and page object models.
 */
public class Exercise10 {
	
public static WebDriver globalEventDriver;
public static MenuPage menu= new MenuPage();
public static LoginPage loginPage= new LoginPage();
public static WelcomePage welcomePage= new WelcomePage();
public static AdminPage adminuser= new AdminPage();
/**
 * Initialise the web elements in  page object models.
 */
@BeforeSuite
public static void setUp(){
	WebDriver normalDriver=DriverManager.getDriver();
	WebDriverListener listener= new CustomListener();
	globalEventDriver = new EventFiringDecorator<WebDriver>(listener).decorate(normalDriver);
	final	WebDriver eventDriver = new EventFiringDecorator<WebDriver>(listener).decorate(normalDriver);
			
	URLManager.GoToApplication();
	PageFactory.initElements(eventDriver, menu);
	PageFactory.initElements(eventDriver, loginPage);
	PageFactory.initElements(eventDriver, welcomePage);
	PageFactory.initElements(eventDriver, adminuser);
	
	}

/**
 * Test to give correct user name and correct password in the input fields of login page.
 */
@Test
public void loggingWithCorrectUsernameAndPassword() throws InterruptedException{
	menu.logOut();
	Thread.sleep(3000);
	loginPage.setLanguageTo("French");
	loginPage.loginWith("admin", "superduper");
	Thread.sleep(3000);
	
	System.out.println("Test1 Success");
	//Assertion.assertTrue(welcomePage.isWelcomeMessageDisplayed());
	
}

/**
 * Test to give correct user name and incorrect password in the input fields of login page.
 */
@Test
public void loggingWithCorrectUsernameAndIncorrectPassword() {
	menu.logOut();
	
	loginPage.setLanguageTo("French");
	loginPage.loginWith("admin", "superdup");
	
	
	System.out.println("Test2 Fail");
	org.testng.Assert.assertFalse(welcomePage.isWelcomeMessageDisplayed());
}
/**
 *Test to give incorrect user name and correct password in the input fields of login page.
 */
@Test
public void loggingWithIncorrectUsernameAndPassword(){
	menu.logOut();
	
	loginPage.setLanguageTo("French");
	loginPage.loginWith("adn", "superper");
	
	
	System.out.println("Test3 Fail");
	Assert.assertFalse(welcomePage.isWelcomeMessageDisplayed());
}
/**
 * Test to give empty user name and  password in the input fields of login page.
 */
@Test
public void loggingWithemptyUsernameAndPassword(){
	menu.logOut();
	
	loginPage.setLanguageTo("French");
	loginPage.loginWith("", "");
	
	
	System.out.println("Test4 fail");
	//Assertion.assertFalse(welcomePage.isWelcomeMessageDisplayed());
}
/**
 * Closes all the windows of application under test
 */

@AfterSuite
public static void tearDown(){
	
	DriverManager.quitDriver();
	
}



}
