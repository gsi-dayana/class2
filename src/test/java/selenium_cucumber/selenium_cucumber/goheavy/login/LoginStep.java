package selenium_cucumber.selenium_cucumber.goheavy.login;

import static org.junit.Assert.fail;

import java.util.NoSuchElementException;

import org.junit.Assert;

import selenium_cucumber.selenium_cucumber.goheavy.login.page.LoginPage;

public class LoginStep {

	private LoginPage loginPage;

	public LoginStep() {
		loginPage = new LoginPage();
	}

	public void checkPage() {
		String path = loginPage.getPagePath().toLowerCase();
		Assert.assertTrue(" The path privide is not correct in the url. path: " + path,
				loginPage.getCurrentUrl().toLowerCase().contains(path));

		try {
			loginPage.getLogingTextElemnt();
		} catch (Exception e) {
			fail("The view do not match with Login page.");
		}
	}

	public void openURL() {
		loginPage.openURL();
	}

	public void the_unauthenticated_go_heavy_user_is_in_the_view() {
		this.openURL();
		checkPage();

	}

	public void user_insert_email_and_password(String email, String password) {
		loginPage.fillCredentials(email, password);

	}

	public void user_clicks_on_the_button() {
		loginPage.clickOnButtons();

	}

	public void the_system_allows_the_user_access_to_the_system() {
		try {
			loginPage.waitForElelemtDisappear();
		} catch (Exception e) {
			fail(" The login view did not dissapear.");
		}

	}

}
