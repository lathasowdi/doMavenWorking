

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
/**
 * Class representing web elements and actions performed using the web elements in WelcomePage.
 */
public class WelcomePage {
	
	@FindBy(how= How.ID, using="welcome")
	private WebElement welcomeMessage;
	/**
	 * Gets the text in Welcome page message
	 * @return welcome message text
	 */
	public String getWelcomeMessage() {
		return welcomeMessage.getText();
	}
	/**
	 * Verify the welcome message contains string "Welcome")
	 * @return true if the welcome message contains string "Welcome"
	 * @return false if the welcome message does contain string "Welcome"
	 */
	public boolean isWelcomeMessageDisplayed() {
		if(getWelcomeMessage().contains("Welcome"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
		
		
	
