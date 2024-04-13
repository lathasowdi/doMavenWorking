

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
/**
 * Class representing web elements and actions performed using the web elements in Login page.
 */

public class LoginPage {
	

	@FindBy(how= How.ID, using="username")
	private WebElement usernameInput;
	
	@FindBy(how= How.ID, using="password")
	private WebElement passwordInput;
	
	@FindBy(how= How.NAME, using="language")
	private WebElement listLanguage;
	
	@FindBy(how= How.XPATH, using="//body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]")
	private WebElement btnLogin;
	/**
	 * login functionality to login to AUT
	 * @param username
	 * @param password
	 */
	public void loginWith(String username, String password) {
		usernameInput.clear();
		usernameInput.sendKeys(username);
		passwordInput.clear();
		passwordInput.sendKeys(password);
		btnLogin.click();
	}
	/**
	 * Displays error message when username or password is incorrect.
	 */
	
	public String getErrorMessage() {
		return"Please enter correct username and password";
	}
	
	/**
	 * Sets up the required language
	 * @param language chosen language
	 */
	public void setLanguageTo(String language) {
		Select setLanguage=new Select(listLanguage);
		setLanguage.selectByVisibleText(language);

	}
	

}
