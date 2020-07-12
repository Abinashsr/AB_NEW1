package BaseClass;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Browser {

static WebDriver driver;

public static WebDriver StartBrowser(String url) throws InterruptedException {
driver = new HtmlUnitDriver();
       System.out.println("Test Case Started");
       Thread.sleep(1000);
driver.get(url);
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