package BaseClass;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

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
	
		//String path = System.getProperty("user.dir");
		//System.out.println(path);
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		HashMap<String, Object> chromePrefs = new HashMap<>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		//chromePrefs.put("download.default_directory", path);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		       options.addArguments("--no-sandbox"); //Bypass OS security model
		            options.addArguments("--disable-web-security");
		            options.addArguments("--ignore-urlfetcher-cert-requests");
		            options.addArguments("--disable-renderer-backgrounding");
		            options.addArguments("--disable-infobars"); //Disabling infobars
		            options.addArguments("--start-maximized"); //Open Browser in maximized mode
		            options.addArguments("--disable-dev-shm-usage"); //Overcome limited resource problem
		            options.setExperimentalOption("useAutomationExtension", false);
		            options.addArguments("--log-level=3"); // set log level
		            options.addArguments("--silent");
		            options.addArguments("--disable-gpu");
		            options.addArguments("window-size=1920,1080");
		            options.addArguments("headless");
		       driver = new ChromeDriver(options);
		       System.out.println("Test Case Started");
		       Thread.sleep(5000);
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
