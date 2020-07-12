package BaseClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {

	static WebDriver driver;

	public static WebDriver StartBrowser(String browsername, String url) throws InterruptedException {
	
		// If the browser is Chrome
			// Set the path for chromedriver.exe
			//String path = System.getProperty("user.dir");
			//System.out.println(path); 
			System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
			ChromeOptions options = new ChromeOptions();
	        options.addArguments("headless");
	        options.addArguments("window-size=1200x600");
	        driver = new ChromeDriver(options);
	  //      driver.get("https://contentstack.built.io");
	  //      driver.get("http://test-webapp.gl-project1.com/webapp/welcome.jsp");
	        System.out.println("Test Case Started");
			//driver.manage().deleteAllCookies();
			Thread.sleep(1000);
			//driver.get(url);
			return driver;
	}
	
	
	public void failed()
	{
	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
	FileUtils.copyFile(srcFile, new File("/CucumberSelenium/Screenshots"
	+ "ScreenshotsTaken/tests.jpg"));
	} catch (IOException e) {
	e.printStackTrace();
	}
	}
	 
	}
