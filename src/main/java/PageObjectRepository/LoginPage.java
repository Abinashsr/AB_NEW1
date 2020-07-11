package PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement LoginPageUserName;

	@FindBy(xpath = "//input[@name='password']")
	WebElement LoginPagePassword;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement LoginPageSignButton;
	


	// Set user name in textbox
	public void setUserName(String strUserName) {
		LoginPageUserName.sendKeys(strUserName);
	}

	// Set password in password textbox
	public void setPassword(String strPassword) {
		LoginPagePassword.sendKeys(strPassword);

	}

	// Click on login button
	public void clickLogin() {
		LoginPageSignButton.click();
	}
	

	public void LoginToApplication(String strUserName, String strPasword) {
		// Fill user name
		this.setUserName(strUserName);
		// Fill password
		this.setPassword(strPasword);
	}

}
