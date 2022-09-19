package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class iraPageObjects {
	

	public iraPageObjects (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (css = ".avm-banner > .avm-banner-text")
	private WebElement iraInitialText;
	
	@FindBy (css = "span[aria-label = Test agent - IRA]")
	private WebElement botOpen;
	

	@FindBy (css = ".avm-banner > .avm-banner-text")
	private WebElement botIcon;
	
	@FindBy (css = "#bot-menu-container  button[title= \"Close Menu\"]")
	private WebElement menuOptionsDownArrow;
	
	@FindBy (css = ".editor-wrapper #queryTextbox")
	private WebElement queryTextBox;
	
	@FindBy (css = ".compose-message-fields > button[type = \"button\"]")
	private WebElement menuOptions;
	
	@FindBy (css = ".bot-menu-cont a[actionname= \"Start Over\"]")
	private WebElement startOver;
	
	@FindBy (css = ".default_card_link a[title =  \"Download Motor Policy\"]")
	private WebElement downloadMotorPolicy;
	
	@FindBy (css = ".default_card_link a[title =  \"Download\"]")
	private WebElement downloadHyperLink;
	
	@FindBy (css = ".compose-message-fields > button[aria-label = \"Send\"]")
	private WebElement sendButton;
	
	@FindBy (css = ".composer input[aria-label = \"Full name\"]")
	private WebElement fullNameTextBox;
	
	@FindBy (css = ".composer textarea[aria-label = \"Address\"]")
	private WebElement addressTextBox;
	
	@FindBy (xpath = "//span[text() = \"Female\"]/preceding-sibling::span")
	private WebElement femaleRadioButton;
	
	@FindBy (xpath = "//input[contains(@class, 'picklist-textbox')]")
	private WebElement selectDropDown;
	
	@FindBy (xpath = "//li[text() = \"Rarely\"])")
	private WebElement rarelyDropdownOption;
	
	@FindBy ( css = "label[aria-label= \"rating 4\"]")
	private WebElement rating4;
	
	@FindBy (css = "button[aria-label= \"Submit\"]")
	private WebElement submitButton;
	
	@FindBy (css = "a[aria-label= \"Google\"]")
	private WebElement googleOption;
	
	@FindBy (css = "button[aria-label= \"close webview popup\"]")
	private WebElement closeWebView;
		
	@FindBy (css = "a[title= \"Call\"]")
	private WebElement callOption;
	
	@FindBy (css = "div[class=\"message-wrap\"] p[class=\"desc text-content\"]")
	private WebElement responseText;
	
	public WebElement getResponseText() {
		return responseText;
	}

	public WebElement getIraInitialText() {
		return iraInitialText;
	}

	public WebElement getBotIcon() {
		return botIcon;
	}
	
	public WebElement getBotOpen() {
		return botOpen;
	}

	public WebElement getMenuOptionsDownArrow() {
		return menuOptionsDownArrow;
	}

	public WebElement getQueryTextBox() {
		return queryTextBox;
	}

	public WebElement getMenuOptions() {
		return menuOptions;
	}

	public WebElement getStartOver() {
		return startOver;
	}

	public WebElement getDownloadMotorPolicy() {
		return downloadMotorPolicy;
	}

	public WebElement getDownloadHyperLink() {
		return downloadHyperLink;
	}

	public WebElement getSendButton() {
		return sendButton;
	}

	public WebElement getFullNameTextBox() {
		return fullNameTextBox;
	}

	public WebElement getAddressTextBox() {
		return addressTextBox;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getSelectDropDown() {
		return selectDropDown;
	}

	public WebElement getRarelyDropdownOption() {
		return rarelyDropdownOption;
	}

	public WebElement getRating4() {
		return rating4;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public WebElement getGoogleOption() {
		return googleOption;
	}

	public WebElement getCloseWebView() {
		return closeWebView;
	}

	public WebElement getCallOption() {
		return callOption;
	} 
	
	
}
