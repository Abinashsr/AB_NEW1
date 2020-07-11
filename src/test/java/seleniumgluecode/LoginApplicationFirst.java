package seleniumgluecode;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;

import com.vimalselvam.cucumber.listener.Reporter;

import BaseClass.Browser;
import BaseClass.ListenersClass;
import PageObjectRepository.LoginPage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@Listeners(ListenersClass.class)
public class LoginApplicationFirst extends Browser{
	
	public static WebDriver driver;
	   LoginPage login;
	   
	@Given("^user is on homepage using first url$")
	public void user_is_on_homepage_using_first_url() throws Throwable {
		
    	driver = Browser.StartBrowser("Chrome","http://test-webapp.gl-project1.com/webapp/welcome.jsp");
    	driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        Reporter.addStepLog("Chrome Browser is opened successfully");
        Thread.sleep(1000);
	}

	@Then("^user enter username \"([^\"]*)\" and User enter password \"([^\"]*)\" for first url$")
	public void user_enter_username_and_User_enter_password_for_first_url(String username, String password) throws Throwable {
		login = new LoginPage(driver);
  	    login.setUserName(username);
  	    Reporter.addStepLog("User Name enetered successfully");
  	    login.setPassword(password);
  	    Reporter.addStepLog("Password enetered successfully");
	}

	@When("^user navigates to Login Page using first url$")
	public void user_navigates_to_Login_Page_using_first_url() throws Throwable {
		 login = new LoginPage(driver);
   	     login.clickLogin();
   	     Reporter.addStepLog("Login Button is clicked successfully");
	}

	@Then("^Close the first url browser$")
	public void close_the_first_url_browser() throws Throwable {
        Reporter.addStepLog("Browser is closed successfully");
	}
	
        @After
        public void tearDown(Scenario scenario) {
          try {
            if (scenario.isFailed()) {
              final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
              scenario.embed(screenshot, "image/png");
            }
          } finally {
            driver.quit();
          }
        }}


