package steps;

import java.sql.SQLException;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.DatabasePage;
import page.LoginPage;
import page.TestBase;

public class LoginStepDefinition extends TestBase {
	LoginPage loginpage;

	@Before
	public void beforerunmethod() {
		init();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
	}

	@Given("^User is on the Techfios login page$")
	public void user_is_on_the_Techfios_login_page() {
		driver.get("https://techfios.com/billing/?ng=login/after/dashboard");
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void when_user_enters_password_as(String password) throws InterruptedException {
		loginpage.enterpassword(password);
		Thread.sleep(3000);
	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) throws Throwable {
		loginpage.enterusername(username);
		Thread.sleep(3000);
	}

	@When("^User clicks on signin button$")
	public void when_user_clicks_on_signin_button() throws InterruptedException {
		loginpage.clicksigninbutton();
		Thread.sleep(3000);
	}

	@Then("^User should land on Dashboard page$")
	public void then_User_should_land_on_Dashboard_page() throws Throwable {
//		System.out.println("user is on the dashboard page");
		String expected= "Dashboard- iBilling";
		Assert.assertEquals(expected, loginpage.getpagetitle());
		takescreenshot(driver);
	}
	
	@When ("^User enters \"([^\"]*)\" from mysql database$")
	public void User_enters_from_mysql_database(String data) throws ClassNotFoundException, SQLException {
		if (data.equalsIgnoreCase("username")) {loginpage.enterusername(DatabasePage.getdata("username"));}
		else if (data.equalsIgnoreCase("password")) {loginpage.enterpassword(DatabasePage.getdata("password"));}
		else {System.out.println("unable to pull data from DB");}
	}

		
	@After
	public void tearDown()
	{ driver.close();
	driver.quit();
	}
	}

