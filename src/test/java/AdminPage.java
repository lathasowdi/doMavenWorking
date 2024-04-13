

import org.openqa.selenium.Alert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Class representing web elements and actions performed using the web elements in Admin page.
 */

public class AdminPage {
	
	
	
	@FindBy(how= How.XPATH, using="//label[contains(text(),'reset users')]")
	private WebElement btnRestUsers;
	
	@FindBy(how= How.XPATH, using="//input[@id='new_username']")
	private WebElement txtUserName;
	
	
	@FindBy(how= How.XPATH, using="//input[@id='new_password']")
	private WebElement txtPassword;
	
	@FindBy(how= How.XPATH, using="//span[contains(text(),'create')]")
	private WebElement btnCreate;
	
	/**
	 * Clicks the Reset user button
	 */
	
	public void btnRestUsersClick() {
		btnRestUsers.click();
		}
	/**
	 * Create new user
	 * @param username
	 * @param password
	 */
	
	public void createNewUser(String username, String password) {
		txtUserName.clear();
		txtUserName.sendKeys(username);
		txtPassword.clear();
		txtPassword.sendKeys(password);
		btnCreate.click();
			}
	/**
	 * Accepts the popup.
	 */
	
	public void acceptPopUp() {
		
	DriverManager.getDriver().switchTo().alert().accept();
		}

}