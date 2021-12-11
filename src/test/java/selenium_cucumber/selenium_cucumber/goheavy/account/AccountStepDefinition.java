package selenium_cucumber.selenium_cucumber.goheavy.account;

import io.cucumber.java.en.*;

public class AccountStepDefinition {

	private final AccountStep accountStep;

	public AccountStepDefinition() {
		accountStep = new AccountStep();
	}

	@Given("The user is in  \"Account Settings\" view")
	public void the_user_is_in_view() {
		accountStep.openAccountSetting();
		accountStep.checkPage();
	}

	@When("User insert valid data")
	public void user_insert_valid_data() {
		accountStep.fillValidData();
	}

	@When("clicks on the \"Update\" button")
	public void clicks_on_the_button() {
		accountStep.clicksUpdate();
	}

	//Scenario 5
	@When("User clicks on the component used for image uploading")
	public void user_clicks_on_the_component_used_for_image_uploading() throws Exception {
		try {
			accountStep.clickOnImageUploading();
		} catch(Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Then("The system saves the user profile information")
	public void the_system_saves_the_user_profile_information() {
		accountStep.checkSpinningAppears();
	}

	@Then("The system displays popup with success message: {string}")
	public void the_system_displays_popup_with_success_message(String string) {
		accountStep.checkUpdateMessage(string);
	}

	//Scenario 5
	@Then("The system opens a file selection dialog window for the user to search the file in his device")
	public void the_system_opens_a_file_selection_dialog_window_for_the_user_to_search_the_file_in_his_device() throws Exception {
		try {
			accountStep.checkImageButton();
		} catch(Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}
