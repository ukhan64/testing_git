package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;

	// constructor
	public LoginPage(WebDriver drivertest)

	{
		this.driver = drivertest;
	}
	// Element library
	// Identify Elements

//				By username= By.xpath("//input[@id='username']");

	@FindBy(xpath = "//input[@id='username']")
	WebElement USERNAME_FIELD;
	@FindBy(xpath = "//input[@id='password']")
	WebElement PASSWORD_FIELD;
	@FindBy(xpath = "//button[contains(text(),'Sign in')]")
	WebElement SIGNIN_FIELD;

	// Now define the interactive methods like clicking on or sending keys bla bla

	public void enterusername(String username) {
		USERNAME_FIELD.sendKeys(username);
	}

	public void enterpassword(String password) {
		PASSWORD_FIELD.sendKeys(password);
	}

	public void clicksigninbutton() {
		SIGNIN_FIELD.click();
	}

	// Technique combined method

	public void testlogin(String username, String password) {
		USERNAME_FIELD.sendKeys(username);
		PASSWORD_FIELD.sendKeys(password);
		SIGNIN_FIELD.click();
	}

	public String getpagetitle() {
		return driver.getTitle();
	}
}
