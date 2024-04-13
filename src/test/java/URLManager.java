/**
	 * Class to get the AUT URL and manage the window
	 */

public class URLManager {
	/**
	 * Navigate to application under test
	 */
	public static void GoToApplication() {
		DriverManager.getDriver().get("https://app-tst-training.azurewebsites.net/");
		DriverManager.getDriver().manage().window().maximize();
		System.out.println("Navigate to website");
		
	}
	

}
