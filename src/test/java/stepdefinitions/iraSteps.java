package stepdefinitions;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.iraPageObjects;

public class iraSteps {

	WebDriver driver;
	public iraPageObjects iraPageObjects;

	@Given("^user is on Test agent IRA page$")
	public void user_is_already_on_Test_agent_IRA_page() {
		System.setProperty("webdriver.chrome.driver","/Users/monali.patnaik/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://c6.avaamo.com/web_channels/444588bc-92fe-477f-87c1-88a92946346a/demo.html?theme=avm-messenger&banner=true&demo=true&banner_text=%20&banner_title=This%20is%20how%20the%20chat%20agent%20shows%20up");
	}


	@When("^the user clicks on Notification$")
	public void the_user_clicks_on_Notification()  {
		
		System.out.println(iraPageObjects.getIraInitialText());
		iraPageObjects.getBotIcon().click();
		
	}

	@When("^the user gets into the bot$")
	public void the_user_gets_into_the_bot() throws Throwable {
		
		Assert.assertEquals(iraPageObjects.getBotOpen().getText(), "Test agent - IRA");
		
	}

	@When("^user types '(.*)' greeting message$")
	public void user_types_Hello_greeting_message(String GreetingMessage)throws InterruptedException{
		iraPageObjects.getMenuOptionsDownArrow().click();
		iraPageObjects.getQueryTextBox().sendKeys(GreetingMessage);
		iraPageObjects.getSendButton().click();
		
	}

	@Then("^a response message is displayed$")
	public void a_response_message_is_displayed() throws Throwable {

		System.out.println(iraPageObjects.getResponseText().getText());
		Assert.assertEquals(iraPageObjects.getResponseText().getText(), "Hi there, what can I help you with today?");
	}

	@Then("^user clicks '(.*)' button from the Menu Options$")
	public void user_clicks_Start_Over_button_from_the_Menu_Options(String Button)throws InterruptedException{
		iraPageObjects.getStartOver().click();
	}

	@Then("^user selects '(.*)' option is clicked$")
	public void user_selects_Download_Motor_Policy_option_is_clicked(String Option)throws InterruptedException {
		iraPageObjects.getDownloadMotorPolicy().click();
	}

	@Then("^user clicks on download$")
	public void user_clicks_on_download() throws Throwable {
		iraPageObjects.getDownloadHyperLink().click();
		String currentWindowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		
		for(String s : windowHandles) {
			if(s != currentWindowHandle) {
				driver.switchTo().window(s);
				break;
			}
		}
		
		//To close the download tab
		driver.close();  
		
		driver.switchTo().window(currentWindowHandle);
		
	}

	@Then("^user types '(.*)'$")
	public void user_types_Test_Bot(String type1)throws InterruptedException {
		iraPageObjects.getQueryTextBox().sendKeys(type1);
	}

	@Then("^user fills the form with Manager values$")
	public void user_fills_the_form_with_Manager_values() throws Throwable {
		iraPageObjects.getFullNameTextBox().sendKeys("Agent Romanoff");
		iraPageObjects.getAddressTextBox().sendKeys("Avengers");
		iraPageObjects.getFemaleRadioButton().click();
		iraPageObjects.getSelectDropDown().click();
		iraPageObjects.getRarelyDropdownOption().click();
		iraPageObjects.getRating4().click();
		iraPageObjects.getSubmitButton().click();
	}

	@Then("^user types '(.*)'$")
	public void user_types_New_Test(String type2)throws InterruptedException {
		iraPageObjects.getQueryTextBox().sendKeys(type2);
	}

	@Then("^user clicks on '(.*)'$")
	public void user_clicks_on_Google(String link1)throws InterruptedException {
		if(link1 == "Google") {
			iraPageObjects.getGoogleOption().click();
		}
	}

	@Then("^user closes the web view$")
	public void user_closes_the_web_view() throws Throwable {
		iraPageObjects.getCloseWebView().click();
	}

	@Then("^user clicks on '(.*)'$")
	public void user_clicks_on_Call(String link2)throws InterruptedException {
		if(link2 == "Call") {
			iraPageObjects.getCallOption().click();
		}
	}

	@Then("^user closes the call popup$")
	public void user_closes_the_call_popup() {
		String currentWindowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		
		for(String s : windowHandles) {
			if(s != currentWindowHandle) {
				driver.switchTo().window(s);
				break;
			}
		}
		
		//To close the call tab
				driver.close();  
	}



}
