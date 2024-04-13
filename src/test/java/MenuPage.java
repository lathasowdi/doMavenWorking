

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
/**
 * Class representing web elements and actions performed using the web elements in MenuPage.
 */
public class MenuPage {
	
	@FindBy(how= How.ID, using="logout")
	private WebElement btnLogout;
	
	@FindBy(how= How.XPATH, using="//a[contains(text(),'Admin')]")
	private WebElement btnAdmin;
	 
	/**
	 * To log out of AUT.
	 */
	public void logOut() {
		btnLogout.click();
		}
	/**
	 * To click button in Admiin page
	 */
	public void btnAdminClick() {
		btnAdmin.click();
		}

}
