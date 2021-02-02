package uni.pl.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pl.fmi.models.LoginPageModel;

public class LoginSteps {
	
	LoginPageModel loginPageModel = new LoginPageModel();
	
	@Given("^Портебителя отваря екрана за вход в системата$")
	public void openLoginScreen() throws Throwable {
		loginPageModel.navigateToMe();
	}

	@When("^Въвежда потребителско име \"([^\"]*)\"$")
	public void addUserName(String username) throws Throwable {
		loginPageModel.setUsername(username);
	}

	@When("^Въвежда парола \"([^\"]*)\"$")
	public void addPassword(String password) throws Throwable {
		loginPageModel.setPassword(password);
	}

	@When("^Натиска бутона за вход в системата$")
	public void clickLoginButton() throws Throwable {
		loginPageModel.clickLoginButton();
	}

	@Then("^Вижда съобщение \"([^\"]*)\"\\.$")
	public void checkLoginMessage(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, loginPageModel.getLoginMessage());
	}
}
